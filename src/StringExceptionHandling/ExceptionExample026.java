package StringExceptionHandling;

/**
 * Exception handling example 26
 */
public class ExceptionExample026 {
    public static void main(String[] args) {
        try {
            int result = 26 / 18;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
