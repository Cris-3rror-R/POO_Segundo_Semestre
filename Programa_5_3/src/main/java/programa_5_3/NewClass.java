package programa_5_3;
import java.util.*;
import java.lang.*;
import java.io.*;
public class NewClass {
    public void DetectarNum(String auxN){
        int Detectar;
        try{
            Detectar=Integer.parseInt(auxN);
            System.out.println("Es un numero entero.");
        }catch(NumberFormatException a){
            System.out.println("No es un numero entero.");
        }
    }
    public void DetectarArre(int ch){
        boolean Num=false;
        String auxA;
        int Arreglo[]={0,1,2,3,4,5,6,7,8,9};
        int Posicion=0;
        int b;
            while(!Num){
                System.out.println("Ingrese la posicion de arreglo que seas revisar.");
                    auxA=new Scanner(System.in).nextLine();
                try{
                    Posicion=Integer.parseInt(auxA);
                    Num=true;
                }catch(NumberFormatException a){
                    System.out.println("No es un caracter valido, volver a introduccir el dato.");
                    break;
                }
                b=Posicion;
                try{
                    System.out.println("Posicion "+Posicion+" su valor es "+Arreglo[b]);
                }catch(ArrayIndexOutOfBoundsException c){
                    System.out.println("No existe esa posicion en el arreglo.");
                }
               
            }
    }
    public void DetectarFile(String auxF){
      File nombreArchivo = new File("C:/Users/crist/OneDrive/Escritorio/Prueba/"+auxF);
        if(nombreArchivo.exists()){
            System.out.println("El archivo existe.");
        }else{
            System.out.println("El archivo no existe.");
        }
    }
}
