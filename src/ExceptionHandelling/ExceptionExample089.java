package ExceptionHandelling;

/**
 * Exception handling example 89
 */
public class ExceptionExample089 {
    public static void main(String[] args) {
        try {
            int result = 89 / 81;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
