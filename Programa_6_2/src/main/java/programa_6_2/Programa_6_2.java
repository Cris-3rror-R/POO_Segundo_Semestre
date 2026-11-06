package programa_6_2;
import java.util.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Programa_6_2 {
public static void main(String[] args) {
    boolean fin=false;
    boolean finMenu=false;
    String aux;
    String op;
        while(!fin){
            finMenu=false;
            try{
            System.out.println("Introduzca el nombre del archivo de la carpeta Prueba para comprobar si existe el archivo.");
            aux=new Scanner(System.in).nextLine();
            String ruta="C:/Users/crist/OneDrive/Escritorio/Prueba/"+aux;
            File nombreArchivo = new File(ruta);
            if(nombreArchivo.exists()){
                System.out.println("Archivo existe en el carpeta Prueba");
            }else{
                nombreArchivo.createNewFile();
               
                System.out.println("Archivo no existe, pero fue creado ahora existe.");
            }
          }
            catch(Exception e){
            }
            while(!finMenu){
                System.out.println("Deseas buscar otro archivo de la carpeta Prueba.");
                op=new Scanner(System.in).nextLine();
                    switch(op){
                        case "Si","si","SI":
                            finMenu=true;
                            break;
                        case "No","no","NO":
                            System.out.println("Fin del menu y del programa,gracias!!");
                            finMenu=true;
                            fin=true;
                            break;
                        default:
                            System.out.println("No entiendo tal opcion, vuelve a ingresa la respuesta.");
                            break;
                    }
            }
        }
    }
}
