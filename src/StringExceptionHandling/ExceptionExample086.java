package StringExceptionHandling;

/**
 * Exception handling example 86
 */
public class ExceptionExample086 {
    public static void main(String[] args) {
        try {
            int result = 86 / 78;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
