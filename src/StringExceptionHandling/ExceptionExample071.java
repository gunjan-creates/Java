package StringExceptionHandling;

/**
 * Exception handling example 71
 */
public class ExceptionExample071 {
    public static void main(String[] args) {
        try {
            int result = 71 / 63;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
