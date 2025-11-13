package StringExceptionHandling;

/**
 * Exception handling example 95
 */
public class ExceptionExample095 {
    public static void main(String[] args) {
        try {
            int result = 95 / 87;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
