package programa_6_1;
import java.util.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Programa_6_1 {
public static void main(String[] args) {
    try{
        String nombre="H99.txt";
        String ruta="C:/Users/crist/OneDrive/Escritorio/Prueba/"+nombre;
        String contenido="Hey, kid I have your attention?";
        File documento = new File(ruta);
            if(documento.exists()){
                documento.createNewFile();
            }
            FileWriter creador = new FileWriter(documento);
            BufferedWriter buscador = new BufferedWriter(creador);
            buscador.write(contenido);
            buscador.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
