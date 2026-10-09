import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo4 {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("./tema3/archivo.txt");
            int data;
            while((data= file.read()) != -1){
                System.out.println((char)data);
            }
            file.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Esto se ejecuta siempre");
        }
    }
    
}
