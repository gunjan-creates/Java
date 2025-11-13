package ExceptionHandelling;

/**
 * Exception handling example 65
 */
public class ExceptionExample065 {
    public static void main(String[] args) {
        try {
            int result = 65 / 57;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
