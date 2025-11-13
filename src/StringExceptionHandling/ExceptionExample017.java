package StringExceptionHandling;

/**
 * Exception handling example 17
 */
public class ExceptionExample017 {
    public static void main(String[] args) {
        try {
            int result = 17 / 9;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
