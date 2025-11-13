package ExceptionHandelling;

/**
 * Exception handling example 92
 */
public class ExceptionExample092 {
    public static void main(String[] args) {
        try {
            int result = 92 / 84;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
