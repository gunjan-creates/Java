package ExceptionHandelling;

/**
 * Exception handling example 35
 */
public class ExceptionExample035 {
    public static void main(String[] args) {
        try {
            int result = 35 / 27;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
