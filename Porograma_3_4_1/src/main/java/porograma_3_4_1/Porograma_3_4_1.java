package porograma_3_4_1;
import java.util.*;
public class Porograma_3_4_1 {
public static void main(String[] args) {
    String aux;
        String res;
        int end=0;
        int cont=0;
        while(end!=1){
            System.out.println("Ingrese una palabra");
                aux=new Scanner(System.in).nextLine();
                int lS=aux.length()-1;
                char VI [] = new char [lS];
                char VF [] = new char [lS];
                    for(int m=0;m<=lS;m++){
                        VI[m]=aux.charAt(m);
                    }
                    for(int n=lS;n>=0;n--){
                        VF[n]=aux.charAt(n);
                    }
                 for(int p=0;p<=lS;p++){
                     if(VI[p]==VF[p]){
                         cont++;
                     }
                 }
                    if(cont==lS){
                        System.out.println("Es una palabra poligona");
                    }else{
                        System.out.println("No es una palabra poligona");
                    }
                    System.out.println("Te gustaria ingresar otra palabra?");
                        res=new Scanner(System.in).nextLine();
                        if(("No".equals(res))||("no".equals(res))){
                            end++;
                        }
        }
        
        
    }
}
