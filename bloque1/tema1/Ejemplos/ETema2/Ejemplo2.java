import java.io.FileReader;
import java.io.LineNumberReader;

public class Ejemplo2 {
    
    public static void main(String[] args) {
        
        try {
            
            LineNumberReader ln = new LineNumberReader(new FileReader("./ETema2/datos.txt"));
            String line;
            while((line=ln.readLine()) != null){
                System.out.println("Contenido de la linea: " + ln.getLineNumber());
            }

        } catch (Exception e) {
        }
    }

}
