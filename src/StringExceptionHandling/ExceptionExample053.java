package StringExceptionHandling;

/**
 * Exception handling example 53
 */
public class ExceptionExample053 {
    public static void main(String[] args) {
        try {
            int result = 53 / 45;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
