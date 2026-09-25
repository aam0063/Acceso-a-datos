

import java.io.RandomAccessFile;

public class Ejemplo6 {
    public static void main(String[] args) {
        
        try {
            RandomAccessFile file = new RandomAccessFile("./tema1/abecedario.txt", null);
            file.seek(5);
            System.out.println("Puntero ANTES de leer: " + file.getFilePointer()); //escrbibira 5
            int unbyte = file.read();
            System.out.println("Puntero ANTES de leer: " + file.getFilePointer()); //escrbibira 6
            System.out.println((char)unbyte); //escibirá la F
            file.write('0');
            System.out.println("Puntero ANTES de leer: " + file.getFilePointer()); //escrbibira 7


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
