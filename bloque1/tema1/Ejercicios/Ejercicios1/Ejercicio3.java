package Ejercicios1;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    
    try{
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        FileWriter fichero = new FileWriter("./Bloque1/Tema1/datos.txt");
        fichero.write(abecedario);
        fichero.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la posicion ");
        int pos = Integer.parseInt(sc.nextLine());
        System.out.println("Escriba un caracter: ");
        char caracter = sc.next().charAt(0);

        RandomAccessFile random = new RandomAccessFile("./Bloque1/Tema1/datos.txt", abecedario);
        random.seek(pos);
        random.write(caracter);
        random.close();

        System.out.println("Modificacion realizada con exito ");

    }catch (Exception e){
        e.printStackTrace();
    }
}
}