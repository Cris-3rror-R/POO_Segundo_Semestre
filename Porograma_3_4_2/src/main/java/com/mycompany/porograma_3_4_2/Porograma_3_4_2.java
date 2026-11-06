package com.mycompany.porograma_3_4_2;
import java.util.*;
public class Porograma_3_4_2 {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
String respuesta;
        do{
            System.out.println("Ingrese una frase: ");
            String frase = leer.nextLine();
            contarCaracteres(frase);
            
            System.out.println("¿Desea ingresar otra frase? ");
            respuesta = leer.nextLine();
        }while(respuesta.equalsIgnoreCase("si"));
        leer.close();
    }
    public static void contarCaracteres(String frase){
        int vocalesMayusculas = 0;
        int vocalesMinusculas = 0;
        int consonantesMayusculas = 0;
        int consonantesMinusculas = 0;
        int numerosEnteros = 0;
        int numerosDecimales = 0;
        int caracteresEspeciales = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)){
                if (Character.isUpperCase(caracter)){
                    if(esVocal(caracter)){
                        vocalesMayusculas++;
                    }else{
                        consonantesMayusculas++;
                    }
                }else {
                    if(esVocal(caracter)){
                        vocalesMinusculas++;
                    }else {
                        consonantesMinusculas++;
                    }
                }
            }else if(Character.isDigit(caracter)){
                StringBuilder numero = new StringBuilder();
                numero.append(caracter);
                while (i + 1 < frase.length() && Character.isDigit(frase.charAt(i + 1))){
                numero.append(frase.charAt(i+1));
                i++;
            }
                if (i + 1 < frase.length() && frase.charAt(i + 1) == '.'){
                    if (i + 2 < frase.length() && Character.isDigit(frase.charAt(i + 2))){
                        
                                   numerosDecimales++;
                                   i++;
                                   while (i + 1 < frase.length() && Character.isDigit(frase.charAt(i + 1))){
                                   numero.append(frase.charAt(i+1));
                                   i++;
                               }
                           }else {
                        caracteresEspeciales++;
                    }
            }else {
                numerosEnteros++;
            }
        }else {
                caracteresEspeciales++;
            }
        }
        System.out.println("Vocales mayusculas: " + vocalesMayusculas);
        System.out.println("Vocales minusculas: " + vocalesMinusculas);
        System.out.println("Consonantes mayusculas: " + consonantesMayusculas);
        System.out.println("Consonantes minusculas: " + consonantesMinusculas);
        System.out.println("Numeros enteros: " + numerosEnteros);
        System.out.println("Numeros decimales: " + numerosDecimales);
        System.out.println("Caracteres especiales: " + caracteresEspeciales);
    }
    public static boolean esVocal (char c){
        char[]vocales = {'a','e','i','o','u','A','E','I','O','U'};
        for (char vocal : vocales){
            if (c == vocal){
                return true;
            }
        }
        return false;}
}
    

