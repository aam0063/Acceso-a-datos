package tema1;

import java.io.File;

public class Ejercicio1 {
    public static void main(String[] args) {
        File fichero = new File(".\\TEMA01\\Ejemplos\\crearFichero.txt");
        if (fichero.createNewFile()) {
            System.out.println("Fichero creado: " + fichero.getName());
        } else {
            System.out.println("El fichero ya existe.");
        }fsfsadfsda
        
    }
}
