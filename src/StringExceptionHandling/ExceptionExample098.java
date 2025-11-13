package StringExceptionHandling;

/**
 * Exception handling example 98
 */
public class ExceptionExample098 {
    public static void main(String[] args) {
        try {
            int result = 98 / 90;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
