package porograma_4_4_alumnos;
import java.util.*;
public class NewClass {
public void MostrarApo(double prome [],String alumnos [],int cal[][]){
    for(int x=0;x<5;x++){
        if(prome[x]>=70){
            System.out.println(alumnos[x]+" con unas calificaciones de "+cal[x][0]+","+cal[x][1]+","+cal[x][2]+" y un promedio de "+prome[x]);
        }
    }
}
public void MostrarAlto(double prome [],String alumnos [],int cal[][]){
    for(int x=0;x<5;x++){
      if(prome[x]>=85){
            System.out.println(alumnos[x]+" con unas calificaciones de "+cal[x][0]+","+cal[x][1]+","+cal[x][2]+" y un promedio de "+prome[x]);
        }  
    }
}
public void Buscar(double prome [],String alumnos [],int cal[][]){
    String auxNom;
    System.out.println("Introduzca el nombre de la persona que deseas consultar su informacion.");
    auxNom=new Scanner(System.in).nextLine();
    for(int x=0;x<5;x++){
        if(auxNom.equals(alumnos[x])){
            System.out.println(alumnos[x]+" con unas calificaciones de "+cal[x][0]+","+cal[x][1]+","+cal[x][2]+" y un promedio de "+prome[x]);
        }
    }
}
public void Ordenar(double prome [],String alumnos [],int cal[][]){
     int auxC1=0;
     int auxC2=0;
     int auxC3=0;
     int prometotal=5;
     double auxProme=0;
     String auxAlumno="";
     for(int x=0;x<prometotal;x++){
         for(int y=0;y<prometotal;y++){
             if(prome[y]>prome[x]){
                 auxC1=cal[x][0];
                 auxC2=cal[x][1];
                 auxC3=cal[x][2];
                 cal[x][0]=cal[y][0];
                 cal[x][1]=cal[y][1];
                 cal[x][2]=cal[y][1];
                 cal[y][0]=auxC1;
                 cal[y][1]=auxC2;
                 cal[y][2]=auxC3;
                 auxProme=prome[x];
                 prome[x]=prome[y];
                 prome[y]=auxProme;
                 auxAlumno=alumnos[x];
                 alumnos[x]=alumnos[y];
                 alumnos[y]=auxAlumno;
             }
         }
     }
     for(int x=4;x<-1;x--){
          System.out.println(alumnos[x]+" con unas calificaciones de "+cal[x][0]+","+cal[x][1]+","+cal[x][2]+" y un promedio de "+prome[x]);
     }
     
}
}
