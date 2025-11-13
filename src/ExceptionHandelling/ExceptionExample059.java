package ExceptionHandelling;

/**
 * Exception handling example 59
 */
public class ExceptionExample059 {
    public static void main(String[] args) {
        try {
            int result = 59 / 51;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
