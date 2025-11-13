package ExceptionHandelling;

/**
 * Exception handling example 14
 */
public class ExceptionExample014 {
    public static void main(String[] args) {
        try {
            int result = 14 / 6;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
