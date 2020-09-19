/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josep Ferraté Solé
 */
public class AppEAC4P3 {
    static final int MAX_CAPACITAT=25000;
    String mVarietat[]=
    {"Ull de llebre","Garnatxa","Xarel.lo","Maabeu","Parellada"};
    int mQuantitat[]={0,0,0,0,0};
    int quantitatTotalRaim=0;
    int[][]dadesVerificacio={
        {2,250, 250},
        {0,400, 400},
        {2, 0, 250},
        {1, 570,570},
        {3, 350,350},
        {1,870,1440},
        {0,685,1085},
        {2,880,1130},
        {3,836,1186},
        {4,173,173},
        {3,485,1671},
        {4,648,821},
        {0,464,1549},
        {2,583,1713},
        {4,467,1288},
        {1,513,1953},
        {2,927,2640},
        {4,219,1507},
        {2,282,2922},
        {0,953,2502},
        {3,257,1928},
        {0,377,2879},
        {4,693,2200},
        {1,277,2230},
        {0,135,3014},
        {3,829,2757},
        {4,920,3120},
        {2,481,3403},
        {1,949,3179},
        {4,970,4090},
        {3,998,3755},
        {1,981,4160},
        {2,999,4402},
        {3,999,4754},
        {4,999,5089},
        {0,999,4013},
        {1,999,5159},
        {2,999,5401},
        {3,999,4754},
        {3,583,5337}
    };
    
    public static void main(String[] args){
        
        AppEAC4P3 prg=new AppEAC4P3();
        prg.inici();
    }
    private void inici(){
        boolean error=false;
        
        entradaRaim("raïm negre",100);
        for(int i=0;i<mQuantitat.length;i++){
            if(mQuantitat[i]>0){
                error=true;
                mQuantitat[0]=0;
            }
        }
            
      
        if(error){
            System.out.println("Error a l'entrade");
        }else{
            System.out.println("Entrada correcta");
        }
    
        for(int i=0;i<dadesVerificacio.length;i++){
            String nomRaim=mVarietat[dadesVerificacio[i][0]];
            entradaRaim(nomRaim, dadesVerificacio[i][1]);
            if(mQuantitat[dadesVerificacio[i][0]] == dadesVerificacio[i][2]){
                System.out.println("Entrada correcte");
            }else{
                System.out.println("Error a l'entrada");
            }
        }
   }
        private void entradaRaim(String varietat, int quantitat){
            //Escriure el codi
            
            if(quantitat + quantitatTotalRaim < 25000){
                for(int i=0; i<mVarietat.length;i++){
                    if(mVarietat[i].equalsIgnoreCase(varietat)){
                        mQuantitat[i]+=quantitat;
                        quantitatTotalRaim+=quantitat;
                    }
                }
                //System.out.println("dada correcte");
            }else{
                if(quantitat + quantitatTotalRaim>25000){
                    System.out.println("la quantitat és superior a les nostres instalacions");
            }
                
            }
            
   } 
        private int posicioVarietat(String varietat){
            //Escriure el codi
            
            
            for(int y=0;y<mVarietat.length;y++){
                if(mVarietat[y].equalsIgnoreCase(varietat)){
                    return y;
                }
            }
            return -1;
        }
   }

