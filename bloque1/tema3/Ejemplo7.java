public class Ejemplo7 {
    public static void main(String[] args) {
        
        try {
            int a = 10;
            int b = 0;
            int resultado = a/b;
            System.out.println(resultado);
            System.out.println("Esto es una prueba");
            
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico: " + e.getMessage());
        }
    }
    
}
