//package Proj_4;
/*@author Pau*/
import java.util.Scanner; 
public class P4_FerrateS {
    public static final int GENERE_MIN=1;
    public static final int GENERE_MAX=3;
    public static final int TIPUSUSUARI_MIN=0;
    public static final int TIPUSUSUARI_MAX=3;
    public static final String TIPUS_GENERAL="GENERAL";
    public static final String TIPUS_EDUCACIO="EDUCACIO";
    public static final String TIPUS_EMPRESA="EMPRESA";
    public static final String TIPUS_PREMSA="PREMSA";
    public static final int DONA_SESSIO_MIN=0;
    public static final int DONA_SESSIO_MAX=1;
    public static final int CODI_MIN=100;
    public static final int CODI_MAX=2100;
    public static final int IDSESSIO_MIN=4;
    public static final int IDSESSIO_MAX=27;
    public static final int EXPE_MIN=0;
    public static final int EXPE_MAX=30;
    public static final int NUM_GENERENOIA=1;
    public static final int NUM_GENERENOI=2;
    public static final int NUM_GENERENODEF=3;
    public static final String GENERENOIA="NOIA";
    public static final String GENERENOI="NOI";
    public static final String GENERENORESP="-";
    public static final int NUM_TIPUSGENERAL=0;
    public static final int NUM_TIPUSEDU=1;
    public static final int NUM_TIPUSEMP=2;
    public static final int NUM_TIPUSPREM=3;
    public static final String NOM_SESSIOSI="SI";
    public static final String NOM_SESSIONO="NO";
    public static final int NUM_SESSIOSI=1;
    public static final int NUM_SESSIONO=0;
    public static final int INTENTS_MAX=3;
    public static final int NOM_GENERE=1;
    public static final int NOM_TIPUS=1;
    
    public static final int MAX_PARTICIPANTS=10;
    
    public static void main(String[] args){
        int [][] dadesParticipants = new int [MAX_PARTICIPANTS][MAX_PARTICIPANTS];
        /*dadesParticipants[][]
        dadesParticipants[0][i] = codi dels participants (primera columna de l'array)
        dadesParticipants[1][i] = genere dels participants (segona columna)
        dadesParticipants[2][i] = tipus de participants (tercera columna)
        dadesParticipants[3][i] = donaSessio de participants (quarta columna)
        dadesParticipants[4][i] = idSessio de participants (cinquena columna)
        dadesParticipants[5][i] = anysExpe de participants (sisena columna)
        */
        
        /*
        int [] codi=new int [MAX_PARTICIPANTS];
        int [] genere=new int[MAX_PARTICIPANTS];
        int [] tipus= new int [MAX_PARTICIPANTS];
        int [] donaSessio=new int[MAX_PARTICIPANTS];
        int [] idSessio= new int [MAX_PARTICIPANTS];
        int [] anysExpe= new int [MAX_PARTICIPANTS];*/
        int intents=0;
        int i=0;
        int Aux;
        //int participantsEntrats=0;
        int seguir=0;
        int sessio=0;
        
        int mostrarNombreParticipants = 0;
        
        int participantsHomes=0;
        int participantsDones=0;
        int participantsAltres=0;
        int sessioHomes=0;
        int sessioDones=0;
        int sessioAltres=0;
        
        String nomTipus="";
        String nomGenere="";
        String nomSessio="";
        Scanner lector = new Scanner(System.in);
        boolean tipuscorrecta=true, introduirMes;
        boolean bucleNombreParticipants=true;
        
        
            do{
                introduirMes=false;
                //participantsEntrats++;
                
                System.out.println("Introdueix un n�mero de (100 al 2100)");
                tipuscorrecta=lector.hasNextInt();
                if(tipuscorrecta){
                    dadesParticipants[0][i]=lector.nextInt();
                    lector.nextLine();
                    if(( dadesParticipants[0][i]<CODI_MIN)||(dadesParticipants[0][i]>CODI_MAX)){
                        tipuscorrecta=false;
                        System.out.print("Error de dades");
                    }else{
                        if(tipuscorrecta){
                            intents=0;
                            System.out.println("Escull un opci�: \n1 noia\n2 noi \n3 prefereixo no dir");
                            do{
                                System.out.print("Entre una opci�: genere: ");
                                tipuscorrecta=lector.hasNextInt();
                                if(tipuscorrecta){
                                    dadesParticipants[1][i]=lector.nextInt();
                                    lector.nextLine();
                                    if((dadesParticipants[1][i]<GENERE_MIN)||(dadesParticipants[1][i]>GENERE_MAX)){
                                        tipuscorrecta=false;
                                        System.out.print("Error de dades");
                                    }else{
                                        if(tipuscorrecta){
                                            intents=0;
                                            System.out.println("Escull una opci�: \n0Genereal\n1Educaci�\n2Empres\n3Premsa");
                                            do{
                                                System.out.print("Entra una opcio:Tipus: ");
                                                tipuscorrecta=lector.hasNextInt();
                                                if(tipuscorrecta){
                                                    dadesParticipants[2][i]=lector.nextInt();
                                                    lector.nextLine();
                                                    if((dadesParticipants[2][i]<TIPUSUSUARI_MIN)||(dadesParticipants[2][i]>TIPUSUSUARI_MAX)){
                                                        tipuscorrecta=false;
                                                        System.out.print("Error de dades");
                                                    }else{
                                                        if(tipuscorrecta){
                                                            intents=0;
                                                            System.out.println("\n1 Dona Sessi�\n0 No en dona");
                                                            do{
                                                                System.out.println("Escull una opcio: Sessi�: ");
                                                                tipuscorrecta=lector.hasNextInt();
                                                                if(tipuscorrecta){
                                                                    dadesParticipants[3][i]=lector.nextInt();
                                                                    lector.nextLine();
                                                                    if((dadesParticipants[3][i]<DONA_SESSIO_MIN)||(dadesParticipants[3][i]>DONA_SESSIO_MAX)){
                                                                        tipuscorrecta=false;
                                                                        System.out.print("Error de dades");
                                                                        
                                                                    }if(dadesParticipants[3][i]==1){
                                                                        intents=0;
                                                                        System.out.println("Entra id de la sessi� (4-27):id ");
                                                                        do{
                                                                            tipuscorrecta=lector.hasNextInt();
                                                                            if(tipuscorrecta){
                                                                                dadesParticipants[4][i]=lector.nextInt();
                                                                                lector.nextLine();
                                                                                if((dadesParticipants[4][i]<IDSESSIO_MIN)||(dadesParticipants[4][i]>IDSESSIO_MAX)){
                                                                                    tipuscorrecta=false;
                                                                                    System.out.print("Error de dades");
                                                                                }
                                                                                intents++;
                                                                            }
                                                                        
                                                                        }while((!tipuscorrecta)&&(intents<INTENTS_MAX));
                                                                        
                                                                    }else{
                                                                }if(tipuscorrecta){
                                                                    intents=0;
                                                                    System.out.println("Anys Experi�ncia: ");
                                                                    do{
                                                                        System.out.println("Escull una opci�: Experi�ncia: ");
                                                                        tipuscorrecta=lector.hasNextInt();
                                                                        if(tipuscorrecta){
                                                                            dadesParticipants[5][i]=lector.nextInt();
                                                                            lector.nextLine();
                                                                            if((dadesParticipants[5][i]<EXPE_MIN)||(dadesParticipants[5][i]>EXPE_MAX)){
                                                                                tipuscorrecta=false;
                                                                                System.out.print("Error de dades");
                                                                            }
                                                                            intents++;
                                                                        }
                                                                    }while((!tipuscorrecta)&&(intents<INTENTS_MAX));
                                                                }
                                                            }
                                                                intents++;
                                                        }while((!tipuscorrecta)&&(intents<INTENTS_MAX));
                                                    }
                                                }
                                            }
                                                intents++;
                                        }while((!tipuscorrecta)&&(intents<INTENTS_MAX));
                                    }
                                }
                            }
                                intents++;
                        }while((!tipuscorrecta)&&(intents<INTENTS_MAX));
                    }
                }
            }
                
                        
                     
           /* if(tipuscorrecta){
                  switch(dadesParticipants[1][i]){
                      case NUM_GENERENOIA:
                          nomGenere=GENERENOIA;
                          break;
                      case NUM_GENERENOI:
                          nomGenere=GENERENOI;
                          break;
                      case NUM_GENERENODEF:
                          nomGenere=GENERENORESP;
                          break;
                          
                  }
              }
              if(tipuscorrecta){
                  switch(dadesParticipants[2][i]){
                      case NUM_TIPUSGENERAL:
                          nomTipus=TIPUS_GENERAL;
                          break;
                      case NUM_TIPUSEDU:
                          nomTipus=TIPUS_EDUCACIO;
                          break;
                      case NUM_TIPUSEMP:
                          nomTipus=TIPUS_EMPRESA;
                          break;
                      case NUM_TIPUSPREM:
                          nomTipus=TIPUS_PREMSA;
                          break;
                                           
                          
                  }
              }
              if(tipuscorrecta){
                  switch(dadesParticipants[3][i]){
                      case NUM_SESSIONO:
                          nomSessio=NOM_SESSIONO;
                          break;
                      case NUM_SESSIOSI:
                          nomSessio=NOM_SESSIOSI;
                          break;
                  }
              }*/
              if(tipuscorrecta){
                  i++;
              }else{
                  System.out.println("Error de dades");
              }
              
              if(i<MAX_PARTICIPANTS){
                  System.out.println("vols introduir m�s participants? ");
                  tipuscorrecta=lector.hasNextInt();
                  if(tipuscorrecta){
                      seguir=lector.nextInt();
                      if(seguir==1){
                          introduirMes=true;
                      }
                  }else{
                      System.out.println("Error de dades");
                  }
              }
          
        }while((introduirMes)&&(intents<MAX_PARTICIPANTS)); 
            
            System.out.println("S'han inscrit " +i+ " participants");
          
              for(int j=0;j<i;j++){
        
            switch(dadesParticipants[1][j]){
                case NUM_GENERENOIA:
                    nomGenere=GENERENOIA;
                    break;
                case NUM_GENERENOI:
                    nomGenere=GENERENOI;
                    break;
                case NUM_GENERENODEF:
                    nomGenere=GENERENORESP;
                    break;
                    
                    
            }
        
        
            switch(dadesParticipants[2][j]){
                case NUM_TIPUSGENERAL:
                    nomTipus=TIPUS_GENERAL;
                    break;
                case NUM_TIPUSEDU:
                    nomTipus=TIPUS_EDUCACIO;
                    break;
                case NUM_TIPUSEMP:
                    nomTipus=TIPUS_EMPRESA;
                    break;
                case NUM_TIPUSPREM:
                    nomTipus=TIPUS_PREMSA;
                    break;
            }
        
        
            switch(dadesParticipants[3][j]){
                case NUM_SESSIONO:
                    nomSessio=NOM_SESSIONO;
                    break;
                case NUM_SESSIOSI:
                    nomSessio=NOM_SESSIOSI;
                    break;
            }
        
        if(tipuscorrecta){
            
        System.out.println("codi\tgenere\ttipus\tsessio\texperiencia");
        System.out.println(dadesParticipants[0][j]+"\t"+nomGenere+"\t"+nomTipus+"\t"+nomSessio+":"+dadesParticipants[4][j]+"\t"+dadesParticipants[5][j]);
            }
        }
        
        //Endrecem
        System.out.println("Vols mostrar els participants ordenats per experi�ncia? " );
        tipuscorrecta=lector.hasNextInt();
        if(tipuscorrecta){
            seguir=lector.nextInt();
            if(seguir==1){
                for(int k=0;k<i-1;k++){
                    for(int j=k+1;j<i;j++){
                        if(dadesParticipants[5][k]>dadesParticipants[5][j]){
                            Aux=dadesParticipants[5][k];
                            dadesParticipants[5][k]=dadesParticipants[5][j];
                            dadesParticipants[5][j]=Aux;

                            Aux=dadesParticipants[0][k];
                            dadesParticipants[0][k]=dadesParticipants[0][j];
                            dadesParticipants[0][j]=Aux;

                            Aux=dadesParticipants[4][k];
                            dadesParticipants[4][k]=dadesParticipants[4][j];
                            dadesParticipants[4][j]=Aux;

                            Aux=dadesParticipants[1][k];
                            dadesParticipants[1][k]=dadesParticipants[1][j];
                            dadesParticipants[1][j]=Aux;

                            Aux=dadesParticipants[2][k];
                            dadesParticipants[2][k]=dadesParticipants[2][j];
                            dadesParticipants[2][j]=Aux;

                            Aux=dadesParticipants[3][k];
                            dadesParticipants[3][k]=dadesParticipants[3][j];
                            dadesParticipants[3][j]=Aux;
                        }
                    }
                }
            }
            System.out.println("Usuaris ordenats per temps d'experi�ncia");
            for(int j=0;j<i;j++){
              switch(dadesParticipants[1][j]){
                case NUM_GENERENOIA:
                    nomGenere=GENERENOIA;
                    break;
                case NUM_GENERENOI:
                    nomGenere=GENERENOI;
                    break;
                case NUM_GENERENODEF:
                    nomGenere=GENERENORESP;
                    break;
                    
                    
            }
        
        
            switch(dadesParticipants[2][j]){
                case NUM_TIPUSGENERAL:
                    nomTipus=TIPUS_GENERAL;
                    break;
                case NUM_TIPUSEDU:
                    nomTipus=TIPUS_EDUCACIO;
                    break;
                case NUM_TIPUSEMP:
                    nomTipus=TIPUS_EMPRESA;
                    break;
                case NUM_TIPUSPREM:
                    nomTipus=TIPUS_PREMSA;
                    break;
            }
        
        
            switch(dadesParticipants[3][j]){
                case NUM_SESSIONO:
                    nomSessio=NOM_SESSIONO;
                    break;
                case NUM_SESSIOSI:
                    nomSessio=NOM_SESSIOSI;
                    break;
              
            }
            System.out.println("codi\tgenere\ttipus\tsessio\texperiencia");
            System.out.println(dadesParticipants[0][j]+"\t"+nomGenere+"\t"
                    +nomTipus+"\t"+nomSessio+":"+dadesParticipants[4][j]+"\t"
                    +dadesParticipants[5][j]);
            }
            
            
            
            /***************
            Comentaris per explicar i clarificar l'apartat C         
            
            En primer lloc, s'entrara en un bucle per a controlar que s'introdueixi 1 o 0.
            Aix� es fa gracies a la variable bucleNombreParticipants;
            
            S'han definit variables especifiques per a aquest apartat:
            mostrarNombreParticipants --> Ser� 1 o 0, 1=mostrar, 0 = no mostrar.
            
            participantsHomes;
            participantsDones;
            participantsAltres;
            
            Es tracta de 3 variables que serviran com a comptadors i que arranquen en el 0.
            ***************/
            
            if(bucleNombreParticipants=true){
                bucleNombreParticipants=false;
                  
        
                System.out.println("Vols veure el n�mero de participants que hi ha?(0. No. 1. Si)" );
                tipuscorrecta=lector.hasNextInt();


                if(tipuscorrecta){

                    mostrarNombreParticipants=lector.nextInt();

                    if(mostrarNombreParticipants==0){
                        System.out.println("S'ha escollit no." );
                    }

                    if(mostrarNombreParticipants==1){
                        System.out.println("El nombre de participants segons genere es: \n");


                        for(int l=0; l<i ;l++){

                            if(dadesParticipants[1][l]==2){
                                participantsHomes++;
                            }

                            if(dadesParticipants[1][l]==1){
                                participantsDones++;
                            }

                            if(dadesParticipants[1][l]==3){
                                participantsAltres++;
                            }
                        }
                        System.out.println("Homes: "+participantsHomes+".\n");
                        System.out.println("Dones: "+participantsDones+".\n");
                        System.out.println("Altres: "+participantsAltres+".\n");
                    }

                    if(mostrarNombreParticipants>1 && mostrarNombreParticipants<0){
                        System.out.println("has d'escollir 1 o 0.");
                        //seguirem al bucle fins que l'usuari introdueixi 1 o 0.
                        bucleNombreParticipants=true;
                    }
                }
            }
            
                 
                 System.out.print("Usuaris per sesssió: ");
                 tipuscorrecta=lector.hasNextInt();
                 if(tipuscorrecta){
                     seguir=lector.nextInt();
                   
                         for(int r=0;r<i;r++){
                             if(dadesParticipants[3][r]==1){
                                 sessio++;
                                 if(dadesParticipants[1][r]==1){
                                     sessioDones++;
                                     
                                 }if(dadesParticipants[1][r]==2){
                                     sessioHomes++;
                                 }if(dadesParticipants[1][r]==3){
                                     sessioAltres++;
                                 }
                             }
                                 
                       }
                         System.out.println("sessio: \thomes:"+"\t"+sessioHomes+ "\tdones" + "\t"+sessioDones+ "\taltres " + "\t"+sessioAltres);
                         System.out.println("sessio: " +sessio);
                         //System.out.println("sessio: \thomes:"+"\t"+participantsHomes+ "\tdones " +"\t"+participantsDones+ "\taltres " +"\t"+participantsAltres);
                 }
            
        
            }else{
                System.out.println("dades incorrectes");
            }
    }
    }
