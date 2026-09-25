package tema1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Ejemplo de uso de FileInputStream y FileOutputStream

public class Ejemplo5 {

    public static void main(String[] args) {

        String path = "./tema1/texto.txt";
        String pathEscritura = "./tema1/surya.png";

        try {
            FileInputStream entrada = new FileInputStream(path);
            int data;

            while ((data = entrada.read()) != -1) {
                System.out.print((char) data);
            }

            entrada.close();

        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        try {
            String cadena = "Esto es una prueba de escritura";
            byte[] arrayBytes = cadena.getBytes();

            FileOutputStream output = new FileOutputStream(pathEscritura);
            output.write(arrayBytes);
            output.close();

            System.out.println("\nFichero escrito");

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
