package StringExceptionHandling;

/**
 * Exception handling example 29
 */
public class ExceptionExample029 {
    public static void main(String[] args) {
        try {
            int result = 29 / 21;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
