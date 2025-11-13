package StringExceptionHandling;

/**
 * Exception handling example 11
 */
public class ExceptionExample011 {
    public static void main(String[] args) {
        try {
            int result = 11 / 3;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
