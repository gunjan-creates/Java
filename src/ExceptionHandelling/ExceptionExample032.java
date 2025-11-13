package ExceptionHandelling;

/**
 * Exception handling example 32
 */
public class ExceptionExample032 {
    public static void main(String[] args) {
        try {
            int result = 32 / 24;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
