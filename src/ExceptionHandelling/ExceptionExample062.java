package ExceptionHandelling;

/**
 * Exception handling example 62
 */
public class ExceptionExample062 {
    public static void main(String[] args) {
        try {
            int result = 62 / 54;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
