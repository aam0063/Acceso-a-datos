
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        int tamano_buffer = 1024;
        byte[] buffer = new byte[tamano_buffer];

        try {
            
            BufferedInputStream entrada = new BufferedInputStream(
                new FileInputStream("cock100px.png")
            );

            BufferedOutputStream salida = new BufferedOutputStream(
                new FileOutputStream("./copia.png")
            );

            int bytesleidos;
            int bloque = 1;
            while((bytesleidos = entrada.read(buffer)) != -1){
                bloque++;
                salida.write(buffer, 0, bytesleidos);
                System.out.println("Fin bloque: " + bloque );
                bloque++;
            }

            entrada.close();
            salida.close();

        } catch (Exception e) {
        }
    }
}
