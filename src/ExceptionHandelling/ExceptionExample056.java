package ExceptionHandelling;

/**
 * Exception handling example 56
 */
public class ExceptionExample056 {
    public static void main(String[] args) {
        try {
            int result = 56 / 48;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
