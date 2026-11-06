package programa_5_3;
import java.util.*;
import java.lang.*;
public class Programa_5_3 {
public static void main(String[] args) {
       NewClass uno = new NewClass();
        boolean fin=false;
        String op;
        String auxN;
        String auxF;
        int ch=0;
        System.out.println("-----BIENVENIDOS AL MENU DE EXCEPCIONES--------");
        while(!fin){
            System.out.println("1.Detectar si es numero entero.");
            System.out.println("2.Detectar si la posicion de un arreglo existe.");
            System.out.println("3.Detectar si un archivo existe.");
            System.out.println("4.FIN del menu");
            op=new Scanner(System.in).nextLine();
                switch(op){
                    case "1":
                        System.out.println("Ingrese un numero entero.");
                            auxN=new Scanner(System.in).nextLine();
                        uno.DetectarNum(auxN);
                        break;
                    case "2":
                        System.out.println("El arreglo disponible es uno de 10 posiciones.");
                        uno.DetectarArre(ch);
                        break;
                    case "3":
                        System.out.println("Introduzca el nombre del archivo en la carpeta Prueba.");
                            auxF=new Scanner(System.in).nextLine();
                            uno.DetectarFile(auxF);
                         break;
                    case "4","No","no","NO":
                        System.out.println("Gracias por usar el menu, fin.");
                        fin=true;
                        break;
                    default:
                        System.out.println("Opcion inexistente.");
                        break;
                        
                }
            
        }
    }
}
