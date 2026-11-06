package porograma_4_4_alumnos;
import java.util.*;
import java.util.regex.Matcher;
import java.lang.*;
public class Porograma_4_4_Alumnos {
public static void main(String[] args) {
    NewClass uno = new NewClass();
    String alumnos []= new String [5];
    String auxAl []= new String [5];
    int cal[][] = new int [5][3];
    int auxCal[][] = new int [5][3];
    String auxNombre;
    String auxNum;
    double prome []= new double [5];
    double auxPro []= new double [5];
    int contN=0;
    double db=0;
    int ent=0;
    int calN=0;
    int c=0;
    int Sumatoria=0;
    double resu=0;
    boolean endl2=false;
    boolean end13=false;
    String op="";
       System.out.println("----BIENAVENTURADOS------");
        System.out.println("Introduzca los nombres de los estudiantes y sus calificaciones");
        while(!endl2){
            for(int x=0;x<5;x++){
               c=x+1;
               boolean compoN=false;
               boolean nom=false;
                calN=0;
                    while(!compoN){
                        System.out.println("Ingrese el nombre del estudiante "+c+".");
                            auxNombre=new Scanner(System.in).nextLine();
                            nom=validar(auxNombre);
                                if(nom==true){
                                    compoN=true;
                                    alumnos[x]=auxNombre;
                                    auxAl[x]=auxNombre;
                                }else{
                                   System.out.println("Nombre incorrecto, introduzca otra vez el nombre."); 
                                }
                                while(calN<3){
                                        System.out.println("Ingrese las calificaciones del estudiante "+c+".");
                                            auxNum=new Scanner(System.in).nextLine();
                                            try{
                                                ent=Integer.parseInt(auxNum);
                                                db=Double.parseDouble(auxNum);
                                                if((ent>=0)&&(100>=ent)){
                                                if(resu==0){
                                                cal[x][calN]=ent;
                                                auxCal[x][calN]=ent;
                                                calN++;
                                            }
                                                }else{
                                                    System.out.println("Solo valores entre el 0 a 100");
                                                }

                                            }catch(NumberFormatException a){
                                                System.out.println("Solo numeros enteros.");  
                                            }
                                            
                                    }
                    }
                    for(int y=0;y<3;y++){
                        Sumatoria=Sumatoria+cal[x][y];
                    }
                    prome[x]=Sumatoria/3;
                    auxPro[x]=Sumatoria/3;
                    Sumatoria=0;
            }
                while(!end13){
                    System.out.println("----MENU-------");
                    System.out.println("1.Ordenar de mayor a menor promedio.");
                    System.out.println("2.Buscar la informacion de alguien.");
                    System.out.println("3.Imprimir solo los datos de los estudiantes aprobados.");
                    System.out.println("4.Imprimir los promedios de 85 a 100.");
                    System.out.println("5.Finalizar programa.");
                    op=new Scanner(System.in).nextLine();
                        switch(op){
                            case "1" -> {
                               uno.Ordenar(prome, alumnos, cal);
                                
                    }
                            case "2" -> {
                                uno.Buscar(prome, alumnos, cal);
                    }
                            case "3" -> {
                               uno.MostrarApo(prome, alumnos, cal);
                    }
                            case "4" -> {
                                uno.MostrarAlto(prome, alumnos, cal);
                    }
                            case "5" -> {
                                System.out.println("FIN DEL MENU");
                                endl2=true;
                                end13=true;
                                System.out.println("INFORMACION DEL ARREGLO 1");
                                for(int x=0;x<5;x++){
                                    c=x+1;
                                System.out.println("Estudiante "+c+" es "+auxAl[x]);    
                                }
                                System.out.println("INFORMACION DEL ARREGLO 2");
                                for(int x=0;x<5;x++){
                                    c=x+1;
                                System.out.println("Estudiante "+c+" sus calificaciones son:");
                                    for(int y=0;y<3;y++){
                                        System.out.println(auxCal[x][y]+"");
                                    }
                                }
                                System.out.println("INFORMACION DEL ARREGLO 3");
                                for(int x=0;x<5;x++){
                                    c=x+1;
                                System.out.println("Estudiante "+c+" su promedio es "+auxPro[x]);    
                                }
                    }
                            default -> {
                    }
                        }
                }
        }
    }
public static boolean validar(String auxNom){
    return auxNom.matches("^([A-ZÑÁÉÍÓÚ]{1}[a-záéíóú]+[ ]?){3,4}$");
}
}
