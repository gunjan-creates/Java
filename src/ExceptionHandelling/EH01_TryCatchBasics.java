package ExceptionHandelling;

public class EH01_TryCatchBasics {
    public static void main(String[] args) {
        System.out.println("[ExceptionHandelling] EH01_TryCatchBasics: start");
        try {
            int x = 10 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        System.out.println("[ExceptionHandelling] EH01_TryCatchBasics: end");
    }
}
