package programa_5_4;
import java.util.*;
import java.lang.*;
public class Programa_5_4 {
public static void main(String[] args) {
    boolean fin=false;
    String op;
    String num;
    int nume2=0;
    System.out.println("---BIENVENIDOS-------");
        while(!fin){
            System.out.println("------MENU------");
            System.out.println("1.Ejercutar el codigo 15.");
            System.out.println("2.Ejercutar el codigo 16.");
            System.out.println("3.FIN.");
            op=new Scanner(System.in).nextLine();
                switch(op){
                    case "1":
                        System.out.println("Ingrese el valor de un numero entero");
                        num=new Scanner(System.in).nextLine();
                            try{
                                nume2=Integer.parseInt(num);
                                    int valor=nume2;
                                try{
                                valor=valor+1;
                                valor=valor+Integer.parseInt("42");
                                valor=valor+1;
                                System.out.println("Valor al final del try: "+valor);
                            }catch(NumberFormatException a){
                                valor=valor+Integer.parseInt("42");
                                System.out.println("Valor al final del catch: "+valor);
                            }finally{
                                valor=valor+1;
                                System.out.println("Valor al final del finally: "+valor);
                            }
                                valor=valor+1;
                                System.out.println("Valor antes del return: "+valor);
                            }catch(NumberFormatException b){
                                System.out.println("Valor no entero.");
                            }
                        break;
                    case "2":
                        System.out.println("Ingrese el valor de un numero entero");
                        num=new Scanner(System.in).nextLine();
                        try{
                                nume2=Integer.parseInt(num);
                                    int valor=nume2;
                                try{
                                    valor=valor+1;
                                    valor=valor+Integer.parseInt("W");
                                    valor=valor+1;
                                    System.out.println("Valor al final del try: "+valor);
                                }catch(NumberFormatException a){
                                    valor=valor+Integer.parseInt("42");
                                    System.out.println("Valor al final del catch: "+valor);
                                }finally{
                                    valor=valor+1;
                                    System.out.println("Valor al final del finally: "+valor);
                                }
                                    valor=valor+1;
                                    System.out.println("Valor antes del return: "+valor);
                                }catch(NumberFormatException b){
                                System.out.println("Valor no entero.");
                            }    
                        break;
                    case "3","Fin":
                        System.out.println("Fin del menu,gracias.");
                        fin=true;
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                        break;
                }
        }
        
    }
    public static int metodo(){
        int valor=0;
        try{
        valor=valor+1;
        valor=valor+Integer.parseInt("42");
        valor=valor+1;
        System.out.println("Valor al final del try: "+valor);
        }catch(NumberFormatException a){
                valor=valor+Integer.parseInt("42");
                System.out.println("Valor al final del catch: "+valor);
        }finally{
            valor=valor+1;
            System.out.println("Valor al final del finally: "+valor);
        }
        valor=valor+1;
        System.out.println("Valor antes del return: "+valor);
        return valor;
    }
    public static int meto2(){
        int valor=0;
        try{
        valor=valor+1;
        valor=valor+Integer.parseInt("W");
        valor=valor+1;
        System.out.println("Valor al final del try: "+valor);
        }catch(NumberFormatException a){
                valor=valor+Integer.parseInt("42");
                System.out.println("Valor al final del catch: "+valor);
        }finally{
            valor=valor+1;
            System.out.println("Valor al final del finally: "+valor);
        }
        valor=valor+1;
        System.out.println("Valor antes del return: "+valor);
        return valor;
    }
}
