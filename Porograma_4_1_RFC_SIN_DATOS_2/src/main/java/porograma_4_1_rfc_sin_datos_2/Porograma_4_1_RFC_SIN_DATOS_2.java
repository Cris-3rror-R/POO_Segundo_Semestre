package porograma_4_1_rfc_sin_datos_2;
import java.util.*;
import java.lang.*;
public class Porograma_4_1_RFC_SIN_DATOS_2 {
     public static void main(String[] args) {
        boolean endL1 = false;
        String auxRFC;
        String S1P="";
        String S2P="";
        String S3P="";
        String A="";
        String M="";
        String D="";
        int contG =0;
        char b;
System.out.println("INTRODUZCA UN RFC CORRECTO");
        Scanner scanner = new Scanner(System.in);
            while (!endL1){
            auxRFC = scanner.nextLine().toUpperCase();
                if(auxRFC.length()==13){
                    S1P=auxRFC.substring(0, 4);
                    S2P=auxRFC.substring(4, 10);
                    S3P=auxRFC.substring(10);
                for(int x=0;x<S1P.length();x++){
                    b=S1P.charAt(x);
                    if(Character.isUpperCase(b)){
                        contG++;
                    }
                }
                if(contG==4){
                    contG=0;
                    if(S2P.matches("\\d{6}")) {
                        A=S2P.substring(0, 2);
                        M=S2P.substring(2, 4);
                        D=S2P.substring(4);
                        int a=Integer.parseInt(A);
                        int m=Integer.parseInt(M);
                        int d=Integer.parseInt(D);
                        if((a!=0)&&(m>0&&m<13)){
                            if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)&&((d>0)&&(d<32))){
                                for (int x=0;x<S3P.length();x++){
                                    b=S3P.charAt(x);
                                    if(Character.isUpperCase(b)||Character.isDigit(b)){
                                        contG++;
                                    }
                                }
                                if(contG==3) {
                                    System.out.println("RFC CORRECTO, GRACIAS");
                                    endL1=true;
                                }else{
                                  resetear();
                                }
                            }else if((m==4)||(m==6)||(m==9)||(m==11)&&((d>0)&&(d<31))){
                                 for (int x=0;x<S3P.length();x++){
                                    b=S3P.charAt(x);
                                    if(Character.isUpperCase(b)||Character.isDigit(b)){
                                        contG++;
                                    }
                                }
                                if(contG==3) {
                                    System.out.println("RFC CORRECTO, GRACIAS");
                                    endL1=true;
                                }else{
                                  resetear();
                                }
                            }else if((a%4==0)&&((d>0)&&(d<30))) {
                                 for (int x=0;x<S3P.length();x++){
                                    b=S3P.charAt(x);
                                    if(Character.isUpperCase(b)||Character.isDigit(b)){
                                        contG++;
                                    }
                                }
                                if(contG==3) {
                                    System.out.println("RFC CORRECTO, GRACIAS");
                                    endL1=true;
                                }else{
                                  resetear();
                                }
                            }else if((d >0)&&(d<29)){
                                 for (int x=0;x<S3P.length();x++){
                                    b=S3P.charAt(x);
                                    if(Character.isUpperCase(b)||Character.isDigit(b)){
                                        contG++;
                                    }
                                }
                                if(contG==3){
                                    System.out.println("RFC CORRECTO, GRACIAS");
                                    endL1=true;
                                }else{
                                  resetear();
                                }
                            }else{
                                resetear();
                            }
                        }else{
                            resetear();
                        }
                    }else{
                        resetear();
                    }
                }else{
                    resetear();
                }
            }else{
                  resetear();
                }
        }
    }
private static void resetear(){
        System.out.println("RFC INCORRECTO, INTÉNTALO DE NUEVO");
        String auxRFC;
        String S1P="";
        String S2P="";
        String S3P="";
        String A="";
        String M="";
        String D="";
        int contG =0;
    }
    }
