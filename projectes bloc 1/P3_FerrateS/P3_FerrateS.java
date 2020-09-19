/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Josep Ferraté Solé
 */
public class P3_FerrateS {
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
        int [] codi=new int [MAX_PARTICIPANTS];
        int [] genere=new int[MAX_PARTICIPANTS];
        int [] tipus= new int [MAX_PARTICIPANTS];
        int [] donaSessio=new int[MAX_PARTICIPANTS];
        int [] idSessio= new int [MAX_PARTICIPANTS];
        int [] anysExpe= new int [MAX_PARTICIPANTS];
        int intents=0;
        int i=0;
        int Aux;
        int participantsEntrats=0;
        int seguir=0;
        String nomTipus="";
        String nomGenere="";
        String nomSessio="";
        Scanner lector = new Scanner(System.in);
        boolean tipuscorrecta=true, introduirMes;
        
        
            do{
                introduirMes=false;
                System.out.println("Introdueix un número de (100 al 2100)");
                tipuscorrecta=lector.hasNextInt();
                if(tipuscorrecta){
                    codi[i]=lector.nextInt();
                    lector.nextLine();
                    if(( codi[i]<CODI_MIN)||(codi[i]>CODI_MAX)){
                        tipuscorrecta=false;
                        System.out.print("Error de dades");
                    }else{
                        if(tipuscorrecta){
                            intents=0;
                            System.out.println("Escull un opció: \n1 noia\n2 noi \n3 prefereixo no dir");
                            do{
                                System.out.print("Entre una opció: genere: ");
                                tipuscorrecta=lector.hasNextInt();
                                if(tipuscorrecta){
                                    genere[i]=lector.nextInt();
                                    lector.nextLine();
                                    if((genere[i]<GENERE_MIN)||(genere[i]>GENERE_MAX)){
                                        tipuscorrecta=false;
                                        System.out.print("Error de dades");
                                    }else{
                                        if(tipuscorrecta){
                                            intents=0;
                                            System.out.println("Escull una opció: \n0Genereal\n1Educació\n2Empres\n3Premsa");
                                            do{
                                                System.out.print("Entra una opcio:Tipus: ");
                                                tipuscorrecta=lector.hasNextInt();
                                                if(tipuscorrecta){
                                                    tipus[i]=lector.nextInt();
                                                    lector.nextLine();
                                                    if((tipus[i]<TIPUSUSUARI_MIN)||(tipus[i]>TIPUSUSUARI_MAX)){
                                                        tipuscorrecta=false;
                                                        System.out.print("Error de dades");
                                                    }else{
                                                        if(tipuscorrecta){
                                                            intents=0;
                                                            System.out.println("\n1 Dona Sessió\n0 No en dona");
                                                            do{
                                                                System.out.println("Escull una opcio: Sessió: ");
                                                                tipuscorrecta=lector.hasNextInt();
                                                                if(tipuscorrecta){
                                                                    donaSessio[i]=lector.nextInt();
                                                                    lector.nextLine();
                                                                    if((donaSessio[i]<DONA_SESSIO_MIN)||(donaSessio[i]>DONA_SESSIO_MAX)){
                                                                        tipuscorrecta=false;
                                                                        System.out.print("Error de dades");
                                                                        
                                                                    }if(donaSessio[i]==1){
                                                                        intents=0;
                                                                        System.out.println("Entra id de la sessió (4-27):id ");
                                                                        do{
                                                                            tipuscorrecta=lector.hasNextInt();
                                                                            if(tipuscorrecta){
                                                                                idSessio[i]=lector.nextInt();
                                                                                lector.nextLine();
                                                                                if((idSessio[i]<IDSESSIO_MIN)||(idSessio[i]>IDSESSIO_MAX)){
                                                                                    tipuscorrecta=false;
                                                                                    System.out.print("Error de dades");
                                                                                }
                                                                                intents++;
                                                                            }
                                                                        
                                                                        }while((!tipuscorrecta)&&(intents<INTENTS_MAX));
                                                                        
                                                                    }else{
                                                                }if(tipuscorrecta){
                                                                    intents=0;
                                                                    System.out.println("Anys Experiència: ");
                                                                    do{
                                                                        System.out.println("Escull una opció: Experiència: ");
                                                                        tipuscorrecta=lector.hasNextInt();
                                                                        if(tipuscorrecta){
                                                                            anysExpe[i]=lector.nextInt();
                                                                            lector.nextLine();
                                                                            if((anysExpe[i]<EXPE_MIN)||(anysExpe[i]>EXPE_MAX)){
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
                  switch(genere[i]){
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
                  switch(tipus[i]){
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
                  switch(donaSessio[i]){
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
                  System.out.println("vols introduir més participants? ");
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
        
            switch(genere[j]){
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
        
        
            switch(tipus[j]){
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
        
        
            switch(donaSessio[j]){
                case NUM_SESSIONO:
                    nomSessio=NOM_SESSIONO;
                    break;
                case NUM_SESSIOSI:
                    nomSessio=NOM_SESSIOSI;
                    break;
            }
        
        if(tipuscorrecta){
            
        System.out.println("codi\tgenere\ttipus\tsessio\texperiencia");
        System.out.println(codi[j]+"\t"+nomGenere+"\t"+nomTipus+"\t"+nomSessio+":"+idSessio[j]+"\t"+anysExpe[j]);
            }
        }
      //Endrecem
      System.out.println("Vols mostrar els participants ordenats per experiència? " );
      tipuscorrecta=lector.hasNextInt();
      if(tipuscorrecta){
          seguir=lector.nextInt();
          if(seguir==1){
              for(int k=0;k<i-1;k++){
                  for(int j=k+1;j<i;j++){
                      if(anysExpe[k]>anysExpe[j]){
                          Aux=anysExpe[k];
                          anysExpe[k]=anysExpe[j];
                          anysExpe[j]=Aux;
                          
                          Aux=codi[k];
                          codi[k]=codi[j];
                          codi[j]=Aux;
                          
                          Aux=idSessio[k];
                          idSessio[k]=idSessio[j];
                          idSessio[j]=Aux;
                          
                          Aux=genere[k];
                          genere[k]=genere[j];
                          genere[j]=Aux;
                          
                          Aux=tipus[k];
                          tipus[k]=tipus[j];
                          tipus[j]=Aux;
                          
                          Aux=donaSessio[k];
                          donaSessio[k]=donaSessio[j];
                          donaSessio[j]=Aux;
                      }
                  }
              }
          }
          System.out.println("Usuaris ordenats per temps d'experiència");
          for(int j=0;j<i;j++){
              switch(genere[j]){
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
        
        
            switch(tipus[j]){
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
        
        
            switch(donaSessio[j]){
                case NUM_SESSIONO:
                    nomSessio=NOM_SESSIONO;
                    break;
                case NUM_SESSIOSI:
                    nomSessio=NOM_SESSIOSI;
                    break;
              
          }
        System.out.println("codi\tgenere\ttipus\tsessio\texperiencia");
        System.out.println(codi[j]+"\t"+nomGenere+"\t"+nomTipus+"\t"+nomSessio+":"+idSessio[j]+"\t"+anysExpe[j]);
          
      }
        

    

        }else{
          System.out.println("dades incorrectes");
      }
    }
}
