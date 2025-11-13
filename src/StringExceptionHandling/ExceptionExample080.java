package StringExceptionHandling;

/**
 * Exception handling example 80
 */
public class ExceptionExample080 {
    public static void main(String[] args) {
        try {
            int result = 80 / 72;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
