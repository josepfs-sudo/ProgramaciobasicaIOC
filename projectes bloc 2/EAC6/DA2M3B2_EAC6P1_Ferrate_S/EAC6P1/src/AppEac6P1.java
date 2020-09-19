/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author Josep Ferraté Solé
 */
public class AppEac6P1 {
    static Scanner lector = new Scanner(System.in);
    
    
    
    public static void main(String []args){
        AppEac6P1 pgr = new AppEac6P1();
        pgr.inici();
    }
    private void inici(){
        presentacio();
        
    }
    private void presentacio(){
        String carpeta="";
        String extensio="xml";
        String fitxer="";
        
        File sCarpeta = new File("EAC6P1");
        
        String  opcio="";
        while(!opcio.equalsIgnoreCase("0")){
            lector=new Scanner(System.in);
            System.out.println("1. Mostrar la carpeta de treball de l'aplicació");
            System.out.println("2. Canviar la carpeta de treball de l'aplicació");
            System.out.println("3. Mostrar l'extensió del fitxers de Treball");
            System.out.println("4. Canviar l'extensió del fitxers");
            System.out.println("5. Mostrar els fitxers de la carpeta");
            System.out.println("Entar una opcio:");
            opcio=lector.nextLine();
            switch(opcio){
                case "1":
                    mostrarRutes(sCarpeta);
                    break;
                case "2":
                    canviarCarpetaTreball(carpeta);
                    break;
                case "3":
                    mostrarFitxersTreball("xml");
                    break;
                case "4":
                    canviarExtensionsFitxer();
                    break;
                case "5":
                    mostrarFitxersSegonsExtensio(extensio);
                    break;
                        
                    
            }
        }
        
    }
   
    public void mostrarRutes(File dir){
       
        
        System.out.println("La ruta és: " +dir.getAbsolutePath());
    }
    public boolean canviarCarpetaTreball(String carpeta){
        File sCarpeta1 = new File("C:/tremp");
        boolean ok=true;
        if(ok){
            System.out.println("Indica la carpeta de treball \n1 carpetaDeTreball");
            carpeta=lector.nextLine();
            System.setProperty("user.dir", "sCaperta1");
            ok=true;
        }else{
            ok=false;
        }
        return ok;
    }
    public File llegirNomFitxer(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu el nom de la ruta d'un fitxer: ");
        String nomFitxer=lector.nextLine();
        File f = new File(nomFitxer);
        return f;
    }
    public void canviarExtensionsFitxer(){
        File rutaFitxer=llegirNomFitxer();
        if(rutaFitxer.isFile()){
            File novaRuta=canviarExtensio(rutaFitxer);
            rutaFitxer.renameTo(novaRuta);
            System.out.println("Nom canviar és: " +rutaFitxer+ " a " + novaRuta);
        }else{
            System.out.println("Aquest fitxer no existeix");
        }
        
    }
    public File canviarExtensio(File original){
        String nom=original.getName();
        String pare=original.getParent();
        //cerquem l'últim punt per trobar l'extensió
        int posPunt=nom.lastIndexOf(".");
        if(posPunt>=0){
            //eliminem darrera del punt
            String nouNom=nom.substring(0, posPunt);
            String nouText= pare+File.separator+nouNom;
            File novaRuta=new File(nouText);
            return novaRuta;
        }else{
            return original;
        }
    }
    public void mostrarFitxersSegonsExtensio(String extensio){
         File carpeta = new File("C:\\Users\\usuari\\Escritorio\\Curso de Java\\EAC6P1");
         File[]arrayElements =carpeta.listFiles();
         System.out.println("El contingut de "+carpeta.getAbsolutePath()+ " és");
         for (int i=0; i<arrayElements.length; i++){
             File f=arrayElements[i];
             if(f.isFile()){
                 System.out.println(f.getAbsoluteFile()+"[FIT]");
             }
         }
    }
    public void mostrarFitxersTreball(String ext){
        File carpeta = new File(System.getProperty("user.dir"));
        File [] arrayElements= carpeta.listFiles();
        for(int i=0;i<arrayElements.length;i++){
            File f = arrayElements[i];
            if(f.getName().endsWith(ext)){
                System.out.println("El resultat és: " +f.getName());
            }
                
        }
    }
}
