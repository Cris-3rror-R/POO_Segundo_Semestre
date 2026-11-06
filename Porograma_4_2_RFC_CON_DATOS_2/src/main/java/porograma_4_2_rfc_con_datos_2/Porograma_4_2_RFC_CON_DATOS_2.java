package porograma_4_2_rfc_con_datos_2;
import java.util.*;
import java.util.regex.Matcher;
public class Porograma_4_2_RFC_CON_DATOS_2 {
public static void main(String[] args) {
    String auxNom,auxAp1,auxAp2,auxFecha,auxRFC="",homo="",RFC="",op;
    boolean cF=false;    
    String Me="";
    String Ye="";
    String Di="";
    int A=0;
    int yeah=0;
    int D=0;
    int M=0;
    char b;
    boolean fin=false;
    boolean nom=false;
    boolean Ap1=false;
    boolean Ap2=false;
    boolean f=false;
        while(!fin){
            yeah=0;
            System.out.println("INGRESE LOS SIGUIENTE DATOS PARA OBTENER TU RFC");
            System.out.println("INGRESE TU NOMBRE");
                auxNom=new Scanner(System.in).nextLine();
                nom=validar(auxNom);
                    if((nom==true)&&(!"José".equals(auxNom))&&(!"María".equals(auxNom))){
                      
                            System.out.println("INGRESE TU PRIMER APELLIDO");
                            auxAp1=new Scanner(System.in).nextLine();
                            Ap1=validarAp(auxAp1);
                                if(Ap1==true){
                              
                                            System.out.println("INGRESE TU SEGUNDO APELLIDO");
                                            auxAp2=new Scanner(System.in).nextLine();
                                            Ap2=validarAp(auxAp2);
                                                if(Ap2==true){
                                         
                                                        System.out.println("INGRESE TU FECHA DE NACIMIENTO EN EL FOMATO AAAA/MM/DD");
                                                            auxFecha=new Scanner(System.in).nextLine();
                                                            f=validarF(auxFecha);
                                                                if(f==true){
                                                                  
                                                                            for(int x=0;x<4;x++){
                                                                                    b=auxFecha.charAt(x);
                                                                                        if(b!='/'){
                                                                                            Ye=Ye+b;
                                                                                         }else{
                                                                                            x=100;
                                                                                            }
                                                                                        }
                                                                                        for(int x=5;x<7;x++){
                                                                                            b=auxFecha.charAt(x);
                                                                                        if(b!='/'){
                                                                                            Me=Me+b;
                                                                                                }else{
                                                                                             x=100;
                                                                                        }
                                                                                        }
                                                                                        for(int x=8;x<auxFecha.length();x++){
                                                                                            b=auxFecha.charAt(x);
                                                                                                if(b!='/'){
                                                                                                Di=Di+b;
                                                                                                    }else{
                                                                                                        x=100;
                                                                                                        }
                                                                                            }try{
                                                                                                A=Integer.parseInt(Ye);
                                                                                                D=Integer.parseInt(Di);
                                                                                                M=Integer.parseInt(Me);
                                                                                                }catch(NumberFormatException a){
                                                                                                 }
                                                                                                    System.out.println(A+"/"+M+"/"+D);
                                                                                                    if((A>1900)&&(A<2008)){
                                                                                                    if((M==1)||(M==3)||(M==5)||(M==7)||(M==8)||(M==10)||(M==12)&&((D>0)&&(D<32))){
                                                                                                            System.out.println("FECHA CORRECTA");
                                                                                                                cF=true;
                                                                                                }else if((M==4)||(M==6)||(M==9)||(M==11)&&((D>1)&&(D<31))){
                                                                                                        System.out.println("FECHA CORRECTA");
                                                                                                                cF=true;
                                                                                                            }else if((A%4==0)&&((D>0)&&(D<30))){
                                                                                                            System.out.println("FECHA CORRECTA");
                                                                                                                cF=true;
                                                                                                        }else if((D>0)&&(D<30)){
                                                                                                        System.out.println("FECHA CORRECTA");
                                                                                                                    cF=true;
                                                                                                                }else{
                                                                                                            System.out.println("FECHA INCORRECTA");
                                                                                                                   Me="";
                                                                                                                   Ye="";
                                                                                                                   Di="";
                                                                                                                   }
                                                                                                                }else{
                                                                                                                System.out.println("FECHA INCORRECTA");
                                                                                                                 Me="";
                                                                                                                 Ye="";
                                                                                                                 Di="";
                                                                                                                  }
                                                                                                    if(cF==true){
                                                                                                        System.out.println("Bien Hecho");
                                                                                                        for(int x=0;x<2;x++){
                                                                                                            b=auxAp1.charAt(x);
                                                                                                            auxRFC=auxRFC+b;
                                                                                                        }
                                                                                                        for(int x=0;x<1;x++){
                                                                                                            b=auxAp2.charAt(x);
                                                                                                            auxRFC=auxRFC+b;
                                                                                                        }
                                                                                                        for(int x=0;x<1;x++){
                                                                                                            b=auxNom.charAt(x);
                                                                                                            auxRFC=auxRFC+b;
                                                                                                        }
                                                                                                        RFC=auxRFC.toUpperCase();
                                                                                                        for(int x=2;x<4;x++){
                                                                                                            b=Ye.charAt(x);
                                                                                                            RFC=RFC+b;
                                                                                                        }
                                                                                                        RFC=RFC+Me+Di;
                                                                                                        homo=generarCadena();
                                                                                                        RFC=RFC+homo;
                                                                                                            System.out.println("TU RFC ES LA SIGUIENTE");
                                                                                                            System.out.println(RFC+"");
                                                                                                        System.out.println("DESEAS OTRA RFC?");
                                                                                                            while(yeah<1){
                                                                                                                System.out.println("-----SI------");
                                                                                                                System.out.println("-----NO-----");
                                                                                                                System.out.println("-------------");
                                                                                                                op=new Scanner(System.in).nextLine();
                                                                                                                    switch(op){
                                                                                                                        case "SI":
                                                                                                                            auxRFC="";
                                                                                                                            RFC="";
                                                                                                                            Me="";
                                                                                                                            Ye="";
                                                                                                                            Di="";
                                                                                                                            f=false;
                                                                                                                            nom=false;
                                                                                                                            Ap1=false;
                                                                                                                            Ap2=false;
                                                                                                                            cF=false;
                                                                                                                            yeah++;
                                                                                                                            break;
                                                                                                                        case "NO":
                                                                                                                            fin=true;
                                                                                                                            yeah++;
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            System.out.println("OPCION INVALIDA.");
                                                                                                                            break;
                                                                                                                    }
                                                                                                            }
                                                                                                    }
                                                                }else{
                                                                    System.out.println("FORMATO ERRONEO");
                                                                }
                                                }else{
                                                    System.out.println("Apellido equivocado o incorrecto.");
                                                }
                                }else{
                                    System.out.println("Apellido equivocado o incorrecto.");
                                }
                    }else{
                        System.out.println("Nombre equivocado o incorrecto.");
                    }
                
        }
    
}
public static boolean validar(String auxNom){
    return auxNom.matches("^([A-ZÑÁÉÍÓÚ]{1}[a-záéíóú]+[ ]?){1,2}$");
}
public static boolean validarAp(String auxNom){
    return auxNom.matches("^([A-ZÑÁÉÍÓÚ]{1}[a-záéíóú]+[ ]?){1}$");
}
public static boolean validarF(String auxNom){
     return auxNom.matches("^([0-9]{4}+[/]{1}+[0-9]{2}+[/]{1}+[0-9]{2}+[ ]?){1}$");
}
    public static String generarCadena(){
        String Cara="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb=new StringBuilder();
        Random random=new Random();
        for (int x=0;x<3;x++) {
            int indice=random.nextInt(Cara.length());
            sb.append(Cara.charAt(indice));
        }
        return sb.toString();
    }
}
