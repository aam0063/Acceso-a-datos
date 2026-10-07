import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejercicio1 {

    public static void main(String[] args) {

        try (LineNumberReader in = new LineNumberReader(
                new FileReader("entrada.txt"))) {

            String linea;

            while ((linea = in.readLine()) != null) {

                // Ignorar las líneas vacías
                if (linea.trim().isEmpty()) {
                    continue;
                }

                // Analizar el contenido de la línea
                StreamTokenizer st =
                        new StreamTokenizer(new StringReader(linea));

                int palabras = 0;
                int numeros = 0;

                // Contar palabras y números
                while (st.nextToken() != StreamTokenizer.TT_EOF) {

                    if (st.ttype == StreamTokenizer.TT_WORD) {
                        palabras++;
                    } else if (st.ttype == StreamTokenizer.TT_NUMBER) {
                        numeros++;
                    }
                }

                // Mostrar los resultados
                System.out.println("Línea " + in.getLineNumber()
                        + ": " + linea);

                System.out.println("Palabras: " + palabras
                        + ", Números: " + numeros);

                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: "
                    + e.getMessage());
        }
    }
}