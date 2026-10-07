package Ejercicios1;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         try {
             
            System.out.println("Cuanto rango quieres consultar?");
            int inicio = Integer.parseInt(sc.nextLine());

            System.out.println("cuantos asientos uqieres consultar a partir del numero de seleccion");
            int cantidad = Integer.parseInt(sc.nextLine());

            RandomAccessFile asientos = new RandomAccessFile("./asientos.txt ", "rw");

            asientos.seek(inicio);

            byte[] array = new byte[cantidad];

            asientos.read(array, 0, cantidad);

            for (int i = 0; i < cantidad; i++) {
                System.out.println("asientos " + (inicio + i) + ": " + (char) array[i]);
            }

            sc.close();

         } catch (Exception e) {
         }
    }
}
