import java.io.FileReader;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejemplo1{
    public static void main(String[] args) {
        
        try {
            
        StreamTokenizer st = new StreamTokenizer(new FileReader("./ETema2/Ejemplo1.java"));

        //configurar para q el caracter de nueva linea sea interpretado
        StreamTokenizer.eolIsSignificant(true);

        StreamTokenizer streamTokenizer = new StreamTokenizer(
            
        new StringReader("Hola mi edad es 45"));

        while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            if (streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
                System.out.println("Palabra:" + streamTokenizer.sval);   // token de tipo palabra
            } else if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                System.out.println("Numero:" + streamTokenizer.nval);   // token de tipo número
            } else if (streamTokenizer.ttype == StreamTokenizer.TT_EOL) {
                System.out.println();                       // fin de línea
            }
        }           


        } catch (Exception e) {
        }
    }
}