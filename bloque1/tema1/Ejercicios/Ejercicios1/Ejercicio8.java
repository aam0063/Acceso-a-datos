package Ejercicios1;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Guardar");
        System.out.println("2. Imprimir");
         int opcion = Integer.parseInt(sc.nextLine());

         if(opcion==1){

            System.out.println("Nombre y apellidos:");
            String nombre = sc.nextLine();
            System.out.println("Email:");
            String Email = sc.nextLine();
            System.out.println("Fecha de nacimiento:");
            String FNacimiento = sc.nextLine();
            System.out.println("Genero:");
            String Genero = sc.nextLine();
            System.out.println("Titulacion:");
            String Titulacion = sc.nextLine();

            String contenido = "------Formulario de Matriculacion-------/n" +
                "Nombre y apellidos: " + nombre + "/n" +
                "Email: " + Email + "/n" +
                "Fecha Nacimiento: " + FNacimiento + "/n" +
                "Genero: " + Genero + "/n" +
                "Titulacion: " + Titulacion + "/n";

                try{
                    FileWriter fw = new FileWriter("./matricula.txt");
                    fw.write(contenido);
                    fw.close();

                }catch(Exception e){

                }

         }else if (opcion==2){

            try {
                
                FileReader fr = new FileReader("./matricula.txt");
                int data;
                while((data = fr.read()) != -1){
                    System.out.println((char)data);
                }
                fr.close();

            } catch (Exception e) {
            }

         }
    }
}
