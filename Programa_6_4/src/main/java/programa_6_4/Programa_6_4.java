package programa_6_4;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
//Pida un nombre de un archivo, verifique que existe o no, si existe que lo indique y pregunte si desea reiniciarlo para i
//introduccir informacion  o continuar introducciondo informacion, si no existe que lo cree con la extension.txt
//Menu
//1.Almacenar datos en el usuario(Nombre, correo, fecha de nacimiento y ocupacion.
//2.Consulta informacion del archivo
//3.Eliminar la informacion de una persona
//4.Finalizar
public class Programa_6_4 {
    private static final String FILE_EXTENSION = ".txt";
public static void main(String[] args)throws IOException{
       Scanner scNom = new Scanner (System.in);
       boolean continuar = true;
       System.out.println("Ingrese el nombre del archivo: ");
       String fileName=scNom.nextLine()+FILE_EXTENSION;
       String ruta="C:/Users/crist/OneDrive/Documentos/"+fileName;
       fileName=ruta;
       File file=new File(fileName);
       try{
            if(file.exists()){
                System.out.println("El archivo existe.");
                System.out.println("¿Desea reiniciarlo (Si/No)? ");
                String response = scNom.nextLine();
                if (response.equalsIgnoreCase("Si")) {
                    new PrintWriter(file).close();
                    System.out.println("Archivo reiniciado.");
                }
            }else{
                file.createNewFile();
                System.out.println("Archivo creado: "+fileName);
            }
            do{
                System.out.println("\nMenú:");
                System.out.println("1. Almacenar datos en el archivo");
                System.out.println("2. Consultar la información del archivo");
                System.out.println("3. Eliminar la información de una persona");
                System.out.println("4. Finalizar ejecución");
                System.out.println("Seleccione una opción: ");
                try {
                String op;
                op=scNom.nextLine();
                switch (op) {
                    case "1":
                        AlmacenarDatos(file);
                        break;
                    case "2":
                        Consultar(file);
                        break;
                    case "3":
                        EliminarInfo(file);
                        break;
                    case "4":
                        System.out.println("Fin del programa, gracias.");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }catch(InputMismatchException e){
                System.out.println("Opcion invalida, introduzca una opcion valida.");
                scNom.next(); 
            }
          }while(continuar);
            scNom.close();
        }catch(IOException e){
        }
    }
    private static void AlmacenarDatos(File file) throws IOException {
        FileWriter fw=new FileWriter(file, true);
        PrintWriter pw=new PrintWriter(fw);
        Scanner a=new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre=a.nextLine();
        System.out.println("Ingrese el correo electrónico");
        String email=a.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (yyyy/mm/dd)");
        String fecha=a.nextLine();
        System.out.println("Ingrese la ocupación");
        String ocupacion=a.nextLine();
        pw.println(nombre+","+email+","+fecha+","+ocupacion);
        pw.close();
        System.out.println("Datos almacenados con éxito.");
    }
    private static void Consultar(File file) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader(file));
        String info;
        while ((info=br.readLine())!= null) {
            String[]data=info.split(",");
            System.out.println("Nombre: "+data[0]);
            System.out.println("Correo electrónico: "+data[1]);
            System.out.println("Fecha de nacimiento: "+data[2]);
            System.out.println("Ocupación: "+data[3]);
            System.out.println("--------------------------");
        }
        br.close();
    }
    private static void EliminarInfo(File file) throws IOException {
        Scanner a = new Scanner(System.in);
            while (true){
                try{
                    List<String> infos = Files.readAllLines(file.toPath());
                        System.out.println("Ingrese el nombre de la persona a eliminar: ");
                            String Delete=a.nextLine();
                                boolean A=false;
                    List<String> updatedLines=new ArrayList<>();
                for(String info : infos){
                    if(!info.startsWith(Delete+",")){
                        updatedLines.add(info);
                    }else{
                        A=true;
                }
            }
        
                if(A){
                    Files.write(file.toPath(), updatedLines);
                        System.out.println("Información eliminada con éxito.");
                            break;
                    }else{
                        System.out.println("No se encontró a la persona especificada.");
                }
                    }catch(InputMismatchException e) {
                        System.out.println("Dato ingresado incorrecto, ocurrio un error");}
        }
     }
}

