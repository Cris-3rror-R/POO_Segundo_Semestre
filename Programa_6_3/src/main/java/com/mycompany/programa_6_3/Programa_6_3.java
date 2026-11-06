package com.mycompany.programa_6_3;
import java.util.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
public class Programa_6_3 {
public static void main(String[] args) {
    boolean fin=false;
    boolean finMenu=false;
    String aux;
    String opEle;
    String op;
       while(!fin){
                finMenu=false;
                System.out.println("Que deseas buscar un archivo o una carpeta");
                opEle=new Scanner(System.in).nextLine();
                switch(opEle){
                    case "Carpeta","CARPETA","carpeta":
                        try{
                        System.out.println("Introduzca el nombre del carpeta");
                        aux=new Scanner(System.in).nextLine();
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
                    }catch(Exception f){
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
                        break;
                    case "Archivo","archivo","ARCHIVO":
                        try{
                        System.out.println("Introduzca el nombre del archivo");
                        aux=new Scanner(System.in).nextLine();
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
                    }catch(Exception f){
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
                        break;
                    default:
                        System.out.println("Tan solo Carpeta o Archivo");
                        break;
                }
            }        //Porgrama que pregutne el nombre de un archivo o carpeta, lo busque e indique que existe o no, si no existe lo indeuq y lo cree como archivo, si existe que imprima si se trata de un archivo o carpeta asi como la ruta en donde se encuebta.
    }
}
