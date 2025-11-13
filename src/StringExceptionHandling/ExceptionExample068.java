package StringExceptionHandling;

/**
 * Exception handling example 68
 */
public class ExceptionExample068 {
    public static void main(String[] args) {
        try {
            int result = 68 / 60;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
