/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package porograma_5_2;
import java.io.File;
import java.util.*;
/**
 *
 * @author crist
 */
public class Porograma_5_2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
            Scanner leer = new Scanner(System.in);
        int[] arreglo = {1, 2, 3, 4, 5};
        boolean continuar = true;
        
        
        do {
            System.out.println("1. Detectar si es un numero entero");
            System.out.println("2. Detectar si la posicion del arreglo existe");
            System.out.println("3. Detectar si un archivo existe");
            System.out.println("4. Cerrar programa");
            System.out.print("Ingrese el numero de opcion: ");

            try {
                int opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        validarEntero(leer);
                        break;
                    case 2:
                        validarPosicion(leer, arreglo);
                        break;
                    case 3:
                        validarArchivo(leer);
                        break;
                    case 4:
                        System.out.println("Cerrando programa");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opcion invalida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un numero valido como opcion.");
                leer.next(); 
            }
        } while (continuar);

        leer.close(); 
    }
    private static void validarEntero(Scanner entero) {
        while (true) {
            try {
                System.out.print("Ingrese un valor: ");
                int valor = entero.nextInt();
                System.out.println("Es un numero entero.");
                break;  
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un numero entero valido. Intente de nuevo.");
                entero.next(); 
            }
        }
    }

    private static void validarPosicion(Scanner v, int[] array) {
        while (true) {
            System.out.print("Ingrese la posicion del arreglo: ");
            int posicion;
            try {
                posicion = v.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un numero valido como posicion.");
                v.next(); 
                continue;
            }

            if (posicion >= 0 && posicion < array.length) {
                System.out.println("La posicion existe en el arreglo.");
                break;  
            } else {
                System.out.println("La posicion no existe en el arreglo. Intente de nuevo.");
            }
        }
    }

    private static void validarArchivo(Scanner a) {
        while (true) {
            System.out.print("Ingrese la ruta del archivo: ");
            String rutaArchivo = a.next();
            File archivo = new File(rutaArchivo);
            if (archivo.exists()) {
                System.out.println("El archivo existe.");
                break;  
            } else {
                System.out.println("El archivo no existe. Intente de nuevo.");
            }
        }
    }

    }
