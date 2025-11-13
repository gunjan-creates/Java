package StringExceptionHandling;

/**
 * Exception handling example 77
 */
public class ExceptionExample077 {
    public static void main(String[] args) {
        try {
            int result = 77 / 69;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
