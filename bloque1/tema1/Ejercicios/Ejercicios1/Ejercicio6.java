package Ejercicios1;
public class Ejercicio6 {
    public static void main(String[] args) {

        try {
            
            System.out.println("Sistema de asientos elige dos opciones /n1.elegir un asiento /n2");

            int opciones = Integer.parseInt(sc.nextLine());

            switch (opciones) {
                case 1:

                    RandomAccesFile acceso = new RandomAccesFile("asientos.txt", "rw");

                    System.out.println("Elige un asiento que este disponible: ");

                    int posicion = Integer.parseInt(sc.nextLine());
                    
                    break;
                default:
                    throw new AssertionError();
            }

        } catch (Exception e) {
        }
        
        
    }
}
