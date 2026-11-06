package porograma_5_1;
import java.util.*;
import java.lang.*;
public class Porograma_5_1 {
public static void main(String[] args) {
    int prueba[]={1,2,3,4,5};
    int aux=0;
    String a;
        System.out.println("EXCEPCION DE UN ARREGLO");
        System.out.println("Que posicion deseas buscar?");
            a=new Scanner(System.in).nextLine();
            try{
                aux=Integer.parseInt(a);
            }catch(NumberFormatException b){
                System.out.println("Solo numeros enteros");
            }
            try{
                System.out.println("La posicion "+aux+" su valor es "+prueba[aux]);
            }catch(ArrayIndexOutOfBoundsException c){
                System.out.println("Has intentado acceder a una posicion inexistente en un arreglo de 5 posiciones.");
                System.out.println(c.toString());
            }
        
}
}
