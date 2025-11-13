package ExceptionHandelling;

/**
 * Exception handling example 47
 */
public class ExceptionExample047 {
    public static void main(String[] args) {
        try {
            int result = 47 / 39;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
