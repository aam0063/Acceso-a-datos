
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejemplo3 {

    public static void main(String[] args) {
        
        try {
            
            DataOutputStream dps = new DataOutputStream(new FileOutputStream(".//bloque1//Ejemplos//ETema2/Ejemplos3.java"));
            dps.writeInt(123);
            dps.writeInt(987);
            dps.writeFloat(123.45F);
            dps.writeLong(953953535);
            dps.writeDouble(123);
            dps.writeDouble(9.3);
            dps.close();

            DataInputStream dis = new DataInputStream(new FileInputStream(".//bloque1//Ejemplos//ETema2/Ejemplos3.java"));
            int entero1 = dis.readInt();
            int entero2 = dis.readInt();
            float numerofloat = dis.readFloat();
            long numeroLong = dis.readLong();
            double numeroDouble = dis.readDouble();

        } catch (Exception e) {
        }
    }

}
