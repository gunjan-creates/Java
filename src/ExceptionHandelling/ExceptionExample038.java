package ExceptionHandelling;

/**
 * Exception handling example 38
 */
public class ExceptionExample038 {
    public static void main(String[] args) {
        try {
            int result = 38 / 30;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
