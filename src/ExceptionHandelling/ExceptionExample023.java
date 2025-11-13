package ExceptionHandelling;

/**
 * Exception handling example 23
 */
public class ExceptionExample023 {
    public static void main(String[] args) {
        try {
            int result = 23 / 15;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
