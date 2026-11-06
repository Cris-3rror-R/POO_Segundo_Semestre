package com.mycompany.programa_6_3_1;
import java.util.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
public class Programa_6_3_1 {
public static void main(String[] args) {
    boolean fin=false;
    boolean finMenu=false;
    String op;
    String aux;
    int cont=0;
    char b;
        while(!fin){
            cont=0;
            finMenu=false;
            boolean nomA=false;
            System.out.println("Ingrese el nombre de la carpeta o archivo");
            aux=new Scanner(System.in).nextLine();
                for(int x=0;x<aux.length();x++){
                    b=aux.charAt(x);
                    if(b=='.'){
                       cont++; 
                    }
                }
                if(cont==0){
                    try{
                       String ruta="C:/Users/crist/OneDrive/Documentos/"+aux;
                        File nombreArchivo = new File(ruta);
                        if(!nombreArchivo.exists()){
                            if(nombreArchivo.mkdirs()){
                                System.out.println("No existe la carpeta pero fue creada.");
                                System.out.println("La ruta de la carpeta es "+ruta);
                            }
                        }else{
                                System.out.println("La carperta existe");
                                System.out.println("Su ruta es "+ruta);
                        } 
                    }catch(Exception d){
                    }
                }else{
                    try{
                        String ruta="C:/Users/crist/OneDrive/Documentos/"+aux;
                        File nombreArchivo = new File(ruta);
                        if(nombreArchivo.exists()){
                        System.out.println("El arhivo existe");
                        System.out.println("Su ruta es "+ruta);
                    }else{
                        nombreArchivo.createNewFile();
                        System.out.println("El archivo no existe pero fue creado en el Documentos");
                        System.out.println("Su ruta es "+ruta);
                    }
                    }catch(Exception d){
                        
                    }
                }
                while(!finMenu){
                            System.out.println("Deseas finalizar el programa.");
                            op=new Scanner(System.in).nextLine();
                            switch(op){
                                case "Si","SI","si":
                                    System.out.println("Gracias, fin del programa.");
                                        finMenu=true;
                                        fin=true;
                                    break;
                                case "No","NO","no":
                                    System.out.println("El programa continuara.");
                                        finMenu=true;
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                        }
        }
    }
}
