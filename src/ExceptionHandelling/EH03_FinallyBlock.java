package ExceptionHandelling;

public class EH03_FinallyBlock {
    static int divide(int a, int b) {
        try {
            return a / b;
        } finally {
            System.out.println("finally always runs (cleanup/log here)");
        }
    }

    public static void main(String[] args) {
        System.out.println("[ExceptionHandelling] EH03_FinallyBlock: start");
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }
        System.out.println("[ExceptionHandelling] EH03_FinallyBlock: end");
    }
}
