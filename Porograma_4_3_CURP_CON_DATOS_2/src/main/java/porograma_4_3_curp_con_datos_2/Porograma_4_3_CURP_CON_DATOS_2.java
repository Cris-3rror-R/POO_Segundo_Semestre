package porograma_4_3_curp_con_datos_2;
import java.util.*;
import java.util.regex.Matcher;
public class Porograma_4_3_CURP_CON_DATOS_2 {
    public static void main(String[] args) {
    String auxNom;
    String Num="";
    String auxAp1;
    String auxAp2;
    String auxFecha;
    String auxCURP="";
    String auxCURP3="";
    String auxCURP2="";
    String auxSexo;
    String auxEstado;
    String HomoCurp="";
    String CURP="";
    String op;
    String Me="";
    String Ye="";
    String Di="";
    boolean fin=false;
    boolean nom=false;
    boolean Ap1=false;
    boolean Ap2=false;
    boolean f=false;
    boolean Sex=false;
    boolean cF=false;
    boolean Esta=false;
    int A=0;
    int yeah=0;
    int D=0;
    int M=0;
    char b;
  while(!fin){
        System.out.println("INGRESE LOS SIGUIENTE DATOS PARA OBTENER TU CURP");
        yeah=0;
            while(!nom){
                System.out.println("INGRESE TU NOMBRE");
                auxNom=new Scanner(System.in).nextLine();
                nom=validar(auxNom);
                if((nom==true)&&(!"José".equals(auxNom))&&(!"María".equals(auxNom))){
                    Num=auxNom;
                }else{
                    System.out.println("Nombre incorrecto, intentalo otra vez");
                }
               
            }
            while(!Ap1){
                System.out.println("INGRESE TU PRIMER APELLIDO");
                auxAp1=new Scanner(System.in).nextLine();
                Ap1=validarAp(auxAp1);
                    if(Ap1==true){
                           for(int x=0;x<2;x++){
                            b=auxAp1.charAt(x);
                            auxCURP=auxCURP+b;
                 }
                    for(int x=1;x<auxAp1.length();x++){
                    b=auxAp1.charAt(x);
                    if((b!='a')&&(b!='e')&&(b!='i')&&(b!='o')&&(b!='u')&&(b!='á')&&(b!='é')&&(b!='í')&&(b!='ó')&&(b!='ú')){
                        auxCURP3=auxCURP3+b;
                        x=100;
                    }
                }
                    }else{
                    System.out.println("Apellido incorrecto, intentalo otra vez");
                }
            }
            while(!Ap2){
                System.out.println("INGRESE TU SEGUNDO APELLIDO");
                auxAp2=new Scanner(System.in).nextLine();
                Ap2=validarAp(auxAp2);
                    if(Ap2==true){
                        for(int x=0;x<1;x++){
                        b=auxAp2.charAt(x);
                        auxCURP=auxCURP+b;
                        }
                    for(int x=1;x<auxAp2.length();x++){
                    b=auxAp2.charAt(x);
                    if((b!='a')&&(b!='e')&&(b!='i')&&(b!='o')&&(b!='u')&&(b!='á')&&(b!='é')&&(b!='í')&&(b!='ó')&&(b!='ú')){
                        auxCURP3=auxCURP3+b;
                        x=100;
                    }
                }
                    }else{
                    System.out.println("Apellido incorrecto, intentalo otra vez");
                }
            }
            while(!cF){
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
                    if((A>1900)&&(A<2023)){
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
                    f=false;
                    Me="";
                    Ye="";
                    Di="";
                    }
                    }else{
                    System.out.println("FECHA INCORRECTA");
                    f=false;
                    Me="";
                    Ye="";
                    Di="";
                 } 
                    }else{
                        System.out.println("Formato incorrecto, intentalo otra vez");
                    }
            }
               while(!Sex){
                   System.out.println("INGRESE TU SEXO");
                   auxSexo=new Scanner(System.in).nextLine();
                    if(("Hombre".equals(auxSexo))||("Mujer".equals(auxSexo))){
                        Sex=true;
                            if("Hombre".equals(auxSexo)){
                                for(int x=0;x<1;x++){
                                    b=auxSexo.charAt(x);
                                    auxCURP2=auxCURP2+b;
                                }
                            }else{
                                for(int x=0;x<1;x++){
                                    b=auxSexo.charAt(x);
                                    auxCURP2=auxCURP2+b;
                                }
                            }
                                
                            
                    }else{
                        System.out.println("Sexo inexistente.");
                    }
               }
               while(!Esta){
                    System.out.println("INGRESE TU ESTADO DE NACIMIENTO Y SI ERES NACIDO EN EL EXTRAJERO ESCRIBE LO SIGUIENTE: Nacido en el extrajero");
                    auxEstado=new Scanner(System.in).nextLine();
                        switch(auxEstado){
                            case "Aguascalientes" -> {
                                auxCURP2=auxCURP2+"AS";
                                Esta=true;
                }
                            case "Baja California" -> {
                                auxCURP2=auxCURP2+"BC";
                                Esta=true;
                }
                            case "Baja California Sur" -> {
                                auxCURP2=auxCURP2+"BS";
                                Esta=true;
                }
                            case "Campeche" -> {
                                auxCURP2=auxCURP2+"CC";
                                Esta=true;
                }
                            case "Coahuila" -> {
                                auxCURP2=auxCURP2+"CL";
                                Esta=true;
                }
                            case "Colima" -> {
                                auxCURP2=auxCURP2+"CM";
                                Esta=true;
                }
                            case "Chiapas" -> {
                                auxCURP2=auxCURP2+"CS";
                                Esta=true;
                }
                            case "Chihuahua" -> {
                                auxCURP2=auxCURP2+"CH";
                                Esta=true;
                }
                            case "Distrito Federal" -> {
                                auxCURP2=auxCURP2+"DF";
                                Esta=true;
                }
                            case "Durango" -> {
                                auxCURP2=auxCURP2+"DG";
                                Esta=true;
                }
                            case "Guanajuato" -> {
                                auxCURP2=auxCURP2+"GT";
                                Esta=true;
                }
                            case "Guerrero" -> {
                                auxCURP2=auxCURP2+"GR";
                                Esta=true;
                }
                            case "Hidalgo" -> {
                                auxCURP2=auxCURP2+"HG";
                                Esta=true;
                }
                            case "Jalisco" -> {
                                auxCURP2=auxCURP2+"JC";
                                Esta=true;
                }
                            case "Estado de Mexico" -> {
                                auxCURP2=auxCURP2+"MC";
                                Esta=true;
                }
                            case "Michoacán" -> {
                                auxCURP2=auxCURP2+"MN";
                                Esta=true;
                }
                            case "Morelos" -> {
                                auxCURP2=auxCURP2+"MS";
                                Esta=true;
                }
                            case "Nayarit" -> {
                                auxCURP2=auxCURP2+"NT";
                                Esta=true;
                }
                            case "Nuevo León" -> {
                                auxCURP2=auxCURP2+"NL";
                                Esta=true;
                }
                            case "Oaxaca" -> {
                                auxCURP2=auxCURP2+"OC";
                                Esta=true;
                }
                            case "Puebla" -> {
                                auxCURP2=auxCURP2+"PL";
                                Esta=true;
                }
                            case "Querétaro" -> {
                                auxCURP2=auxCURP2+"QT";
                                Esta=true;
                }
                            case "Quintana Roo" -> {
                                auxCURP2=auxCURP2+"QR";
                                Esta=true;
                }
                            case "San Luis Potosi" -> {
                                auxCURP2=auxCURP2+"SP";
                                Esta=true;
                }
                            case "Sinaloa" -> {
                                auxCURP2=auxCURP2+"SL";
                                Esta=true;
                }
                            case "Sonora" -> {
                                auxCURP2=auxCURP2+"SR";
                                Esta=true;
                }
                            case "Tabasco" -> {
                                auxCURP2=auxCURP2+"TC";
                                Esta=true;
                }
                            case "Tamaulipas" -> {
                                auxCURP2=auxCURP2+"TS";
                                Esta=true;
                }
                            case "Tlaxcala" -> {
                                auxCURP2=auxCURP2+"TL";
                                Esta=true;
                }
                            case "Veracruz" -> {
                                auxCURP2=auxCURP2+"VZ";
                                Esta=true;
                }
                            case "Yucatán" -> {
                                auxCURP2=auxCURP2+"YN";
                                Esta=true;
                }
                            case "Zacatecas" -> {
                                auxCURP2=auxCURP2+"ZS";
                                Esta=true;
                }
                            case "Nacido en el extrajero" -> {
                                auxCURP2=auxCURP2+"NE";
                                Esta=true;
                }
                            default -> System.out.println("Estado desconocido.");
                        }
               }
               
           for(int x=0;x<1;x++){
                    b=Num.charAt(x);
                    auxCURP=auxCURP+b;
                }
                    for(int x=1;x<Num.length();x++){
                    b=Num.charAt(x);
                    if((b!='a')&&(b!='e')&&(b!='i')&&(b!='o')&&(b!='u')&&(b!='á')&&(b!='é')&&(b!='í')&&(b!='ó')&&(b!='ú')){
                        auxCURP3=auxCURP3+b;
                        x=100;
                    }
                }
        CURP=auxCURP.toUpperCase();
        for(int x=2;x<4;x++){
        b=Ye.charAt(x);
        CURP=CURP+b;
        }
        auxCURP3=auxCURP3.toUpperCase();
        CURP=CURP+Me+Di;
        HomoCurp=generarCadena();
        auxCURP3=auxCURP3+HomoCurp;
        CURP=CURP+auxCURP2+auxCURP3;
            System.out.println("TU CURP ES LA SIGUIENTE");
                System.out.println(CURP);
            System.out.println("DESEAS OTRA CURP?");
                while(yeah<1){
                     System.out.println("-----SI------");
                      System.out.println("-----NO-----");
                      System.out.println("-------------");
                      op=new Scanner(System.in).nextLine();
                 switch(op){
                     case "SI":
                        Me="";
                        Ye="";
                        Di="";
                        f=false;
                        nom=false;
                        Ap1=false;
                        Ap2=false;
                        cF=false;
                        Esta=false;
                        Sex=false;
                        yeah++;
                        CURP="";
                        auxCURP="";
                        auxCURP2="";
                        auxCURP3="";
                         break;
                     case "NO":
                         System.out.println("FIN DEL PROGRAMA");
                         yeah++;
                         fin=true;
                         break;
                     default:
                          System.out.println("OPCION INVALIDA, LAS UNICAS OPCIONES SON SI Y NO");
                         break;
                 }
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
        for (int x=0;x<2;x++) {
            int indice=random.nextInt(Cara.length());
            sb.append(Cara.charAt(indice));
        }
        return sb.toString();
    }
}
