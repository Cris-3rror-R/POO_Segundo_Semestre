package porograma_4_1_rfc_sin_datos;
import java.util.*;
import java.lang.*;
public class Porograma_4_1_RFC_SIN_DATOS {
    public static void main(String[] args) {
        boolean endL1=false;
        String auxRFC;
        String S1P="";
        String S2P="";
        String S3P="";
        String D="";
        String M="";
        String A="";
        int m=0;
        int d=0;
        int a=0;
        int contG=0;
        char b;
        System.out.println("INTRODUZCA UNA RFC CORRECTA");
            while(!endL1){
                auxRFC=new Scanner(System.in).nextLine();
                    if(auxRFC.length()==13){
                        for(int x=0;x<5;x++){
                            b=auxRFC.charAt(x);
                            S1P=S1P+b;
                        }
                        for(int y=5;y<11;y++){
                            b=auxRFC.charAt(y);
                            S2P=S2P+b;
                        }
                        for(int z=11;z<14;z++){
                            b=auxRFC.charAt(z);
                            S3P=S3P+b;
                        }
                        for(int x=0;x<5;x++){
                            b=S1P.charAt(x);
                                if(Character.isUpperCase(b)){
                                    contG++;
                                }
                        }
                        if(contG==3){
                           contG=0;
                           for(int w=0;w<7;w++){
                               b=S2P.charAt(w);
                               if(Character.isDigit(b)){
                                   contG++;
                               }
                           }
                            if(contG==6){
                                for(int x=0;x<3;x++){
                            b=S2P.charAt(x);
                            A=A+b;
                        }
                         for(int y=3;y<5;y++){
                            b=S2P.charAt(y);
                            M=M+b;
                        }
                        for(int z=5;z<7;z++){
                            b=S2P.charAt(z);
                            D=D+b;
                        }
                            try{
                                a=Integer.parseInt(A);
                                m=Integer.parseInt(M);
                                d=Integer.parseInt(D);
                            }catch(NumberFormatException B){
                            }
                                if((a!=0)){
                                    if((m>0)&&(m<13)){
                                        if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)){
                                            if((d>0)&&(d<32)){
                                             for(int w=0;w<3;w++){
                                                    b=S3P.charAt(w);
                                                        if(Character.isUpperCase(b)||Character.isDigit(b)){
                                                            contG++;
                                                        }
                                                }
                                                    if(contG==3){
                                                        contG=0;
                                                        System.out.println("RFC CORRECTA, GRACIAS");
                                                        endL1=true;
                                                    }else{
                                    a=0;
                                    m=0;
                                    d=0;
                                    A="";
                                    M="";
                                    D="";
                                    S1P="";
                                    S2P="";
                                    S3P="";
                                    contG=0;
                                                    }
                                            }else{
                                    a=0;
                                    m=0;
                                    d=0;
                                    A="";
                                    M="";
                                    D="";
                                    S1P="";
                                    S2P="";
                                    S3P="";
                                    contG=0;
                                            }
                                        }else if((m==4)||(m==6)||(m==9)||(m==11)){
                                            if((d>0)&&(d<31)){
                                                  for(int w=0;w<3;w++){
                                                    b=S3P.charAt(w);
                                                        if(Character.isUpperCase(b)||Character.isDigit(b)){
                                                            contG++;
                                                        }
                                                }
                                                    if(contG==3){
                                                        contG=0;
                                                        System.out.println("RFC CORRECTA, GRACIAS");
                                                        endL1=true;
                                                    }else{
                                    a=0;
                                    m=0;
                                    d=0;
                                    A="";
                                    M="";
                                    D="";
                                    S1P="";
                                    S2P="";
                                    S3P="";
                                    contG=0;
                                                    }
                                            }else{
                                    a=0;
                                    m=0;
                                    d=0;
                                    A="";
                                    M="";
                                    D="";
                                    S1P="";
                                    S2P="";
                                    S3P="";
                                    contG=0;   
                                            }
                                        }else{
                                        if(a%4==0){
                                        if((d>0)&&(d<30)){
                                          for(int w=0;w<3;w++){
                                                    b=S3P.charAt(w);
                                                        if(Character.isUpperCase(b)||Character.isDigit(b)){
                                                            contG++;
                                                        }
                                                }
                                                    if(contG==3){
                                                        contG=0;
                                                        System.out.println("RFC CORRECTA, GRACIAS");
                                                        endL1=true;
                                                    }else{
                                    a=0;
                                    m=0;
                                    d=0;
                                    A="";
                                    M="";
                                    D="";
                                    S1P="";
                                    S2P="";
                                    S3P="";
                                    contG=0;
                                                    }
                                        }else{
                                    a=0;
                                    m=0;
                                    d=0;
                                    A="";
                                    M="";
                                    D="";
                                    S1P="";
                                    S2P="";
                                    S3P="";
                                    contG=0;   
                                        }
                                        }else{
                                    if((d>0)&&(d<29)){
                                          for(int w=0;w<3;w++){
                                                    b=S3P.charAt(w);
                                                        if(Character.isUpperCase(b)||Character.isDigit(b)){
                                                            contG++;
                                                        }
                                                }
                                                    if(contG==3){
                                                        contG=0;
                                                        System.out.println("RFC CORRECTA, GRACIAS");
                                                        endL1=true;
                                                    }else{
                                    a=0;
                                    m=0;
                                    d=0;
                                    A="";
                                    M="";
                                    D="";
                                    S1P="";
                                    S2P="";
                                    S3P="";
                                    contG=0;
                                                    }
                                    }else{
                                     a=0;
                                    m=0;
                                    d=0;
                                    A="";
                                    M="";
                                    D="";
                                    S1P="";
                                    S2P="";
                                    S3P="";
                                    contG=0;   
                                    }
                                        
                                    }
                                        }
                                    }else{
                                    a=0;
                                    m=0;
                                    d=0;
                                    A="";
                                    M="";
                                    D="";
                                    S1P="";
                                    S2P="";
                                    S3P="";
                                    contG=0;
                                    }
                                }else{
                                    a=0;
                                    m=0;
                                    d=0;
                                    A="";
                                    M="";
                                    D="";
                                    S1P="";
                                    S2P="";
                                    S3P="";
                                    contG=0;
                                }
                            }else{
                            S1P="";
                            S2P="";
                            S3P="";
                            contG=0;
                            }
                        }else{
                            S1P="";
                            S2P="";
                            S3P="";
                            contG=0;
                        }
                    }
            }
    }
}
