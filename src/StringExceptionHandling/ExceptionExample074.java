package StringExceptionHandling;

/**
 * Exception handling example 74
 */
public class ExceptionExample074 {
    public static void main(String[] args) {
        try {
            int result = 74 / 66;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
