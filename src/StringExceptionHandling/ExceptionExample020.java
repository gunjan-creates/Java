package StringExceptionHandling;

/**
 * Exception handling example 20
 */
public class ExceptionExample020 {
    public static void main(String[] args) {
        try {
            int result = 20 / 12;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
