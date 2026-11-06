package com.mycompany.trabajo2_5_2;
import java.util.*;
import java.io.File;
public class Trabajo2_5_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] arreglo = {1, 2, 3, 4, 5};
        boolean c = true; 
        do {
            System.out.println("***** MENU *****");
            System.out.println("1. Detectar si es un numero entero");
            System.out.println("2. Detectar si la posicion del arreglo existe");
            System.out.println("3. Detectar si un archivo existe");
            System.out.println("4. Cerrar programa");
            try {
                int opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        Entero(leer);
                        break;
                    case 2:
                        Posicion(leer, arreglo);
                        break;
                    case 3:
                        Archivo(leer);
                        break;
                    case 4:
                        System.out.println("Fianlizando programa");
                        c = false;
                        break;
                    default:
                        System.out.println("Opcion invalida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Con ese tipo de dato no es valido, intentelo nuevamente");
                leer.next(); 
            }
        } while (c);
        leer.close(); 
    }
    private static void Entero(Scanner entero) {
        while (true) {
            try {
                System.out.println("Ingrese un valor: ");
                int valor = entero.nextInt();
                System.out.println("Es un numero entero.");
                break;  
            } catch (InputMismatchException e) {
                System.out.println("Lo siento ese no es un numero entero");
                entero.next(); 
            }
        }
    }
    private static void Posicion(Scanner v, int[] array) {
        while (true) {
            System.out.println("Ingrese la posicion del arreglo: ");
            int posicion;
            try {
                posicion = v.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("con ese tipo de datos no funciona, ingresa un dato valido");
                v.next(); 
                continue;
            }

            if (posicion >= 0 && posicion < array.length) {
                System.out.println("La posicion existe en el arreglo" );
                break;  
            } else {
                System.out.println("Lo siento esa posicion no existe en el arreglo");
            }
        }
    }
    private static void Archivo(Scanner a) {
        while (true) {
            System.out.println("Ingrese el nombre del archivo: ");
            String nombrearchivo = a.next();
            File archivo = new File(nombrearchivo);
            if (archivo.exists()) {
                System.out.println("El archivo existe."); 
                break;
            } else {
                System.out.println("El archivo no existe. Intente de nuevo.");
            }
        }
    
    }
}
