package tema1;

import java.io.File;
import java.io.IOException;

public class Ejemplo1 {
    public static void main(String[] args) {

        try {
            File fichero = new File("./tema1/crearFichero.txt");

            if (fichero.createNewFile()) {
                System.out.println("Fichero creado: " + fichero.getName());
            } else {
                System.out.println("El fichero ya está creado");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
