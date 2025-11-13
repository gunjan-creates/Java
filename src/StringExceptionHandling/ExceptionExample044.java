package StringExceptionHandling;

/**
 * Exception handling example 44
 */
public class ExceptionExample044 {
    public static void main(String[] args) {
        try {
            int result = 44 / 36;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
