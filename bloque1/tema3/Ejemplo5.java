public class Ejemplo5 {

    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};

            System.out.println(numbers[5]);

            System.out.println("Ocurrió una excepción ArrayIndexOutOfBoundsException: Índice fuera de rango");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción controlada " + e.toString());
        }
    }
}