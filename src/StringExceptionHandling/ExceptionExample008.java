package StringExceptionHandling;

/**
 * Exception handling example 8
 */
public class ExceptionExample008 {
    public static void main(String[] args) {
        try {
            int result = 8 / 1;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
