
import java.io.LineNumberReader;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        String ruta = ".//Ejercicios2//entrada2.txt";
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica que linea quieres leer: ");
        int linea = sc.nextLine();

        try {
            
            LineNumberReader lnr = new LineNumberReader(new FileReader(ruta));
            String lineaActual;
            boolean encontrada = false;

            while((lineaActual = lnr.readLine()) ! = null){
                if(lnr.getLineNumber() == linea){
                    System.out.println("Contenido de la linea " + linea + ":");
                    System.out.println(lineaActual);
                    encontrada = true;
                    break;
                }

                if(!encontrada){
                    System.out.println("Linea no encontrada");
                    break;
                }
            }
            lnr.close();
        } catch (Exception e) {
        }
    }
}
