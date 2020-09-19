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
public class P2_FerrateS {
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
    
    public static void main(String[] args){
        
        //definim les dades
        
        int genere=0, donaSessio=0, idSessio=0, tipus=0, codi=0, anysExpe=0, i=0 , alumnesEntrats=0, seguir=0;
        String nomTipus="";
        String nomGenere="";
        String nomSessio="";
        Scanner lector = new Scanner(System.in);
        boolean tipuscorrecta=true, introduirMes;
       
       do{
         
        introduirMes=false;
        
        do{
            System.out.println("Introdueix un número de (100 al 2100)");
            tipuscorrecta=lector.hasNextInt();
            if(tipuscorrecta){
                codi=lector.nextInt();
                if((codi<CODI_MIN)||(codi>CODI_MAX)){
                    tipuscorrecta=false;
                    System.out.println("Error de dades");
                }
            }
            i++;
        }while((!tipuscorrecta)&&(i<INTENTS_MAX));
        if(tipuscorrecta){
            i=0;//per a cada dada iniciem el comptador intents a 0
            System.out.println("Escull una opció: \n1 noia \n2 noi \n3 prefereixo no dir");
            do{
                System.out.print("Entre una opció: gènere ");
                tipuscorrecta=lector.hasNextInt();
                if(tipuscorrecta){
                    genere=lector.nextInt();
                    if((genere<GENERE_MIN)||(genere>GENERE_MAX))
                        tipuscorrecta=false;{
                        System.out.println("Error de dades");
                    }
                }else{
                    
                    
                    } i++;
                
            }while((!tipuscorrecta)&&(i<INTENTS_MAX));
            
            if(tipuscorrecta){
            i=0;//per a cada dada iniciem el comptador intents a 0
            System.out.println("Escull un tipus \n0 General \n1 Eduació \n2 Empresa \n3 Premsa");
            do{
                System.out.print("Entra una opció: tipus ");
                tipuscorrecta=lector.hasNextInt();
                if(tipuscorrecta){
                    tipus=lector.nextInt();
                    lector.nextLine();
                    if((tipus<TIPUSUSUARI_MIN)||(tipus>TIPUSUSUARI_MAX))
                        tipuscorrecta=false;{
                        System.out.println("Error de dades");
                }
                
                    
               
            
            if(tipuscorrecta){
                i=0;
                System.out.println("\n1 Dona Sessiio \n0 No en dona");
                do{
                    
                    System.out.print("Escull una opció: Sessió ");
                    tipuscorrecta=lector.hasNextInt();
                    if(tipuscorrecta){
                        donaSessio=lector.nextInt();
                        if((donaSessio<DONA_SESSIO_MIN)||(donaSessio>DONA_SESSIO_MAX)){
                        tipuscorrecta=false;{
                        System.out.println("Error de dades");
                        }
                    }
                    }  i++;         
                 
                }while((!tipuscorrecta)&&(i<INTENTS_MAX));
            }
                        
                       
                    if(donaSessio==1){
                         
                        i=0;
                        System.out.print("Entra id de la sessio(4-27): id: ");
                        do{
                        tipuscorrecta=lector.hasNextInt();
                        if(tipuscorrecta){
                            idSessio=lector.nextInt();
                        }
                        if((idSessio<IDSESSIO_MIN)||(idSessio>IDSESSIO_MAX)){
                            tipuscorrecta=false;{
                            System.out.println("Error de dades");
                        }
                            
                            
                            
                            
                        }
                        
                        
                         i++;
                   }while((!tipuscorrecta)&&(i<INTENTS_MAX));
                        
                     }
                }
                
                
                    if(tipuscorrecta){
                    i=0;
                    System.out.println("Anys experiencia(0-30)");
                    do{
                        System.out.println("Escull una opció: Experiècia ");
                        tipuscorrecta=lector.hasNextInt();
                        if(tipuscorrecta){
                            anysExpe=lector.nextInt();
                        
                        if((anysExpe<EXPE_MIN)||(anysExpe>EXPE_MAX)){
                            tipuscorrecta=false;{
                            System.out.println("Error de dades");
                        }
                        }else{
                            
                        }
                        }
                        i++;
                    
                    
                    }while((!tipuscorrecta)&&(i<INTENTS_MAX));
                        }
                     

                   
                
                  
              
               i++;        
            }while((!tipuscorrecta)&&(i<INTENTS_MAX)); 
               
                   
                
           
          
            
          
            
            
        
            
            }  
            
              
                         
      if(tipuscorrecta){
          switch(genere){
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
          switch(tipus){
              case NUM_TIPUSGENERAL:
                 nomTipus= TIPUS_GENERAL;
                 break;
              case NUM_TIPUSEDU:
                 nomTipus= TIPUS_EDUCACIO;
                 break;
              case  NUM_TIPUSEMP:
                 nomTipus= TIPUS_EMPRESA;
                 break;
              case NUM_TIPUSPREM: 
                 nomTipus= TIPUS_PREMSA;
                 break;
                 
          }
      }
      if(tipuscorrecta){
          switch(donaSessio){
              case NUM_SESSIONO:
                  nomSessio= NOM_SESSIONO;
                  break;
              case NUM_SESSIOSI:
                   nomSessio= NOM_SESSIOSI;
                  break;
                  
                      
          }   
      
          
      
      System.out.println("codi\tgenere\ttipus\tsessio\texpeiència");
      System.out.println(+codi +"\t"+nomGenere+"\t"+nomTipus+"\t"+nomSessio+":"+idSessio+"\t"+anysExpe);
            alumnesEntrats++;
   
        }else{
    System.out.println("Programa finalitzat per error en dades");
      }
        }
        System.out.println("Es vol introduir un participant més?");
        tipuscorrecta=lector.hasNextInt();
    


        
   if(tipuscorrecta){
        seguir=lector.nextInt();
        if(seguir==1){
           introduirMes=true;
        }else{
            
        System.out.println("Dada incorrecta");
   }
    }


        }while(introduirMes);           
        System.out.println("S'han inscrit " + alumnesEntrats + " participants ");
    
}
}

        



                    
                    
                    
                    
                    
                    


