package programa_5_2;
import java.util.*;
import java.lang.*;
public class NewClass {
    public void DividirZero(String auxNu,String auxDe){
        int Nu;
        int De;
        double Resultado;
            try{
                Nu=Integer.parseInt(auxNu);
                De=Integer.parseInt(auxDe);
                    if(De==0){
                    System.out.println("No es posible dividir entre 0");
                }else{
                    Resultado=Nu/De;
                    System.out.println("El resultado de la division es "+Resultado);
                }
            }catch(NumberFormatException a){
                System.out.println("Uno de los datos no es un entero");
            }
    }
    public void DeterminarDato(String auxD){
        int Entero;
        double Doble;
        char m;
        if(("true".equals(auxD))||("false".equals(auxD))){
            System.out.println("Es un dato boolean");
        }else if(auxD.length()==1){
                m=auxD.charAt(0);
                if(Character.isDigit(m)){
                 System.out.println("Es un entero");   
                }else{
                 System.out.println("Es un dato char");   
                }
        }else{
            try{
                Entero=Integer.parseInt(auxD);
                    System.out.println("Es un dato int");
            }catch(NumberFormatException a){
                try{
                    Doble=Double.parseDouble(auxD);
                    System.out.println("Es un dato double");
                }catch(NumberFormatException b){
                    System.out.println("Es un dato String");
                }
            }
        }
        
    }
    public void ArregloDimesional(String tipo,String auxCAr){
        int Entero;
        int auxInt;
        double Doble;
        String aux;
        try{
            try{
            Entero=Integer.parseInt(auxCAr);
            int con=0; 
            String arA[]= new String[Entero];
            int arB[]= new int[Entero];
            double arC[] = new double[Entero];
        switch(tipo){
            case "Boolean","BOOLEAN","boolean":
                    while(Entero>con){
                        System.out.println("Introduzca el dato de la posicion "+con);
                           aux=new Scanner(System.in).nextLine();
                         if(("true".equals(aux))||("false".equals(aux))){
                             arA[con]=aux;
                             con++;
                         }else{
                             System.out.println("Dato incorrecto.");
                         }
                    }
                    System.out.println("El arreglo llenado es ");
                        for(int x=0;x<Entero;x++){
                            System.out.println("La posicion "+x+" es "+arA[x]);
                        }
                break;
            case "Entero","Int","int":
                   while(Entero>con){
                       System.out.println("Introduzca el dato de la posicion "+con);
                           aux=new Scanner(System.in).nextLine();
                        try{
                            auxInt=Integer.parseInt(aux);
                            arB[con]=auxInt;
                            con++;
                        }catch(NumberFormatException f){
                            System.out.println("Dato no entero");
                        }
                   }
                   System.out.println("El arreglo llenado es ");
                        for(int x=0;x<Entero;x++){
                            System.out.println("La posicion "+x+" es "+arB[x]);
                        }
                break;
            case "Double","DOUBLE","double":
                while(Entero>con){
                       System.out.println("Introduzca el dato de la posicion "+con);
                           aux=new Scanner(System.in).nextLine();
                        try{
                            Doble=Double.parseDouble(aux);
                            arC[con]=Doble;
                            con++;
                        }catch(NumberFormatException f){
                            System.out.println("Dato no double");
                        }
                   }
                   System.out.println("El arreglo llenado es ");
                        for(int x=0;x<Entero;x++){
                            System.out.println("La posicion "+x+" es "+arC[x]);
                        }
                break;
            case "String","string","STRING":
                for(int x=0;x<Entero;x++){
                        System.out.println("Introduzca el dato de la posicion "+x);
                            aux=new Scanner(System.in).nextLine();
                            arA[x]=aux;
                        }
                   System.out.println("El arreglo llenado es ");
                        for(int x=0;x<Entero;x++){
                            System.out.println("La posicion "+x+" es "+arA[x]);
                        }
                break;
            default:
                System.out.println("No existe esa opcion unicamnete Entero, Double y String");
                break;
        }
        }catch(NumberFormatException d){
            System.out.println("No es un numero valido.");
        }
        }catch(NegativeArraySizeException j){
            System.out.println("No puede ser un arreglo negativo");
        }
        
    }
}
