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
public class AppEAC4P2 {
    static final int MaxMagatzem=25000;
    static final int qMinima=0;
    static final int intentsMax=5;
    String tipusVarietat;
    String [] mVarietat={"Ull de llebre","Garnatxa","Xarel.lo","Macabeu","Parellada"};
    int [] mQuantitat={0,0,0,0,0};
    int quantitatTotalRaim=0;
    Scanner lector = new Scanner(System.in);
    
    public static void main(String[] args){
        AppEAC4P2 prg=new AppEAC4P2();
        prg.inici();
    }
    private void inici(){
        
        presentacio();
        
       
    }
    private void presentacio(){
        int num=0;
        System.out.println("Aquesta aplicació fa la entrada i sortida de raim. Indica que vols fer \n1 entrada de raïm "
                + "\n2 sortida de raim \n3 Estat del Magatzem \n4 sortida");
        num=lector.nextInt();
        if(num==1){
            menuEntrada();
        }else if(num==2){
            menuSortida();
        }else if(num==3){
            estatMagatzem();
        }else if (num==4){
            sortida();
        }
        
    }
    private int llegirInt(){
        boolean tipuscorrecte=true;
        int i=3;
        int quantitat=0;
        
        
            System.out.println("Quina és la quantitat a introduïr? ");
            tipuscorrecte=lector.hasNextInt();
                if(tipuscorrecte){
                quantitat=lector.nextInt();
               }else{
                 System.out.println("has d'introduir un numero");
               
             }
              
            
        return quantitat;
    }
    private String tipusVarietat(){
        String tVarietat="";
        boolean tipuscorrecte=true;
        System.out.println("Quina és la varietat a escullir: \n Ull de llebre \n Garnatxa \n Xarel.lo \n Macabeu \n Parellada");
        tipuscorrecte=lector.hasNextLine();
        if(tipuscorrecte){
            tVarietat=lector.nextLine();
        if(tVarietat.equalsIgnoreCase("ull de llebre")||(tVarietat.equalsIgnoreCase("garnatxa")||(tVarietat.equalsIgnoreCase("xarel.lo")||(tVarietat.equalsIgnoreCase("Macabeu")
                ||(tVarietat.equalsIgnoreCase("Parellada")))))){
            tipuscorrecte=true;
        }else{
            tipuscorrecte=false;
            
        }
           
      }
        return tVarietat;
    }
    private void entradaRaim(String varietat, int quantitat){
        if((quantitat + quantitatTotalRaim)<=MaxMagatzem){
            int posVarietat=posicioVarietat(varietat);
            if(posVarietat>-1){
                mQuantitat[posVarietat]=mQuantitat[posVarietat]+quantitat;
                quantitatTotalRaim=quantitatTotalRaim+quantitat;
            }
        }
    }
    private void sortidaRaim(String varietat, int quantitat){
        int posVarietat=posicioVarietat(varietat);
        if(((quantitat + quantitatTotalRaim)>qMinima)&&(mQuantitat[posVarietat]>quantitat)){
            if(posVarietat>-1){
                mQuantitat[posVarietat]=mQuantitat[posVarietat]-quantitat;
                quantitatTotalRaim=quantitatTotalRaim-quantitat;
            }
        }else{
            System.out.println("Aquesta varietat té menys quantitat");
        }
    }
    private int posicioVarietat(String varietat){
        int pTrobat=-1;
        for(int i=0;i<mVarietat.length;i++){
            if(mVarietat[i].equalsIgnoreCase(varietat)){
                pTrobat=i;
            }
        }
        return pTrobat;
    }
    private void menuEntrada(){
        boolean tipuscorrecte=true;
        int z=0;
        int quantitat=0;
        
        for(int i=0;i<5;i++){
            
            
        String varietat=tipusVarietat();
        varietat=lector.nextLine();
        int posVar=posicioVarietat(varietat);
        int lleg=llegirInt();
        entradaRaim(varietat,lleg);
        //System.out.println("la varietat introduida és: " +varietat+ " i la posicio és " +(posVar));
        System.out.println("la quantitat de " +mVarietat[0]+ " és " +mQuantitat[0]+ " de " +mVarietat[1]+  
                "és " +mQuantitat[1]+ " de " +mVarietat[2]+ " és " +mQuantitat[2]+ " de " +mVarietat[3]+ " és " +
                        mQuantitat[3]+ " de " +mVarietat[4]+ " és " +mQuantitat[4]);
            System.out.println("la quantitat total de raim és: " +quantitatTotalRaim);
        };
        inici();
    }

    private void menuSortida(){
        
        for(int i=0;i<5;i++){
            String var=tipusVarietat();
            var=lector.nextLine();
            int posVar=posicioVarietat(var);
            int lleg=llegirInt();
             sortidaRaim(var,lleg);
            System.out.println("la quantitat de " +mVarietat[0]+ " és " +mQuantitat[0]+ " de " +mVarietat[1]+  
                "és " +mQuantitat[1]+ " de " +mVarietat[2]+ " és " +mQuantitat[2]+ " de " +mVarietat[3]+ " és " +
                        mQuantitat[3]+ " de " +mVarietat[4]+ " és " +mQuantitat[4]);
            System.out.println("la quantitat total de raim és: " +quantitatTotalRaim);
        };
        inici();
    }
    private boolean sortida(){
        String sortida;
        System.out.println("sortida de l'aplicació");
        sortida=lector.nextLine();
        return sortida.equalsIgnoreCase(sortida);
    }
    private void estatMagatzem(){
        avancarMostrar();
        inici();
    }
    private void avancarMostrar(){
        int suma=0;
        int ultim=0;
        System.out.println("Mostrem les dades actualitzades de les varietats amb les seves quantitats i el total");
        System.out.println("la quantitat de " +mVarietat[0]+ " és " +mQuantitat[0]+ " de " +mVarietat[1]+  
                "és " +mQuantitat[1]+ " de " +mVarietat[2]+ " és " +mQuantitat[2]+ " de " +mVarietat[3]+ " és " +
                        mQuantitat[3]+ " de " +mVarietat[4]+ " és " +mQuantitat[4]);
            System.out.println("la quantitat total de raim és: " +quantitatTotalRaim);
        
        for (int i=0;i<mQuantitat.length;i++){
            suma+=mQuantitat[i];
            suma=quantitatTotalRaim;
            
        }
        System.out.println("La quantitat total del magatzem és: " +suma);
        ultim=mQuantitat[4];
        for(int i=3;i>=0;i--){
            mQuantitat[i+1]=mQuantitat[i];
        }
        mQuantitat[0]=ultim;
        for(int i=0;i<mQuantitat.length;i++){
            System.out.println("la nova matriu és: " +mQuantitat[i]);
        }
    }
    
}
