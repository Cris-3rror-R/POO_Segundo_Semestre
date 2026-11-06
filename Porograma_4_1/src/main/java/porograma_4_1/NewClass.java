package porograma_4_1;
import java.lang.*;
public class NewClass {
    public void rfcCompo(String aux){
        char B;
        String auxD="";
        String auxY="";
        String auxM="";
        int dia=0;
        int year=0;
        int mes=0;
        int contM=0;
        int contD=0;
        int contY=0;
        int contMo=0;
        if(aux.length()==13){
            for(int x=0;x<4;x++){
                B=aux.charAt(x);
                if(Character.isUpperCase(B)){
                    contM++;
                }
                if(contM==4){
                    for(int y=4;y<6;y++){
                        B=aux.charAt(y);
                            if(Character.isDigit(B)){
                                contY++;
                                auxY=auxY+B;
                            }
                    }
                if(contY==4){
                    for(int z=6;z<8;z++){
                        
                    }
                }
                }
            }
        }
    }
}
