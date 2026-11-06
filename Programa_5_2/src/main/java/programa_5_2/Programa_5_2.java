package programa_5_2;
import java.util.*;
public class Programa_5_2 {
public static void main(String[] args) {
    NewClass uno = new NewClass();
    boolean fin=false;
    String auxDe;
    String auxNu;
    String auxD;
    String tipo;
    String auxCAr;
    String op;
        while(!fin){
            System.out.println("-----MENU-----");
            System.out.println("1.Division de dos numeros.");
            System.out.println("2.Determinar que tipo de dato.");
            System.out.println("3.Introduzca la longitud del arreglo y el tipo de dato que sera.");
            System.out.println("4.Fin del menu");
                op=new Scanner(System.in).nextLine();
                    switch(op){
                        case "1":
                                System.out.println("Intoduzca el numerador.");
                                    auxNu=new Scanner(System.in).nextLine();
                                System.out.println("Intoduzca el denominador.");
                                    auxDe=new Scanner(System.in).nextLine();
                                   uno.DividirZero(auxNu, auxDe);
                            break;
                        case "2":
                                System.out.println("Introduzca un dato");
                                    auxD=new Scanner(System.in).nextLine();
                                        uno.DeterminarDato(auxD);
                            break;
                        case "3":
                            System.out.println("Introduzca el tipo de dato del arreglo");
                                                        tipo=new Scanner(System.in).nextLine();
                                                    System.out.println("Introduzca la cantidad de datos del arreglo");
                                                        auxCAr=new Scanner(System.in).nextLine();
                                                        uno.ArregloDimesional(tipo, auxCAr);
                            break;
                        case "4","No","NO","no":
                                System.out.println("Gracias, fin del menu.");
                                    fin=true;
                            break;
                        default:
                                System.out.println("Opcion invalida.");
                            break;
                    }
        }
        
    }
}
