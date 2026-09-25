import java.io.RandomAccessFile;

public class Ejemplo7 {
    public static void main(String[] args) {
        
        RandomAccessFile file = new RandomAccessFile("./tema1/abecedario.txt", "r");

        try {
            file.seek(5);
            byte[]arrayBytes = new byte[3];
            file.read(arrayBytes, 0, 3);

            System.out.println("Bytes leidos: " + arrayBytes.length);
            System.out.println("Puntero Desupes de read: " + file.getFilePointer());

            for (int i = 0; i < arrayBytes.length; i++) {
                System.out.println("/n arrayBytes[" + i + "] =" + arrayBytes[1] + " -> " + (char) arrayBytes[i] );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
