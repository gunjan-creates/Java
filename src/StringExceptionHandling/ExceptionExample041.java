package StringExceptionHandling;

/**
 * Exception handling example 41
 */
public class ExceptionExample041 {
    public static void main(String[] args) {
        try {
            int result = 41 / 33;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
