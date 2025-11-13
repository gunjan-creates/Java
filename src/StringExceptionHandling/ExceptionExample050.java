package StringExceptionHandling;

/**
 * Exception handling example 50
 */
public class ExceptionExample050 {
    public static void main(String[] args) {
        try {
            int result = 50 / 42;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
