package ExceptionHandelling;

public class EH09_ExceptionChaining {
    static void lowLevel() {
        throw new IllegalStateException("disk busy");
    }
    static void midLevel() {
        try { lowLevel(); }
        catch (Exception e) { throw new RuntimeException("mid failed", e); }
    }
    public static void main(String[] args) {
        try { midLevel(); }
        catch (RuntimeException e) {
            System.out.println("Chained: " + e + "; cause=" + e.getCause());
        }
    }
}
