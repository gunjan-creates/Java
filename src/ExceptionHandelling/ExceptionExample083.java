package ExceptionHandelling;

/**
 * Exception handling example 83
 */
public class ExceptionExample083 {
    public static void main(String[] args) {
        try {
            int result = 83 / 75;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
