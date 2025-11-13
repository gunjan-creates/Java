package ExceptionHandelling;

public class EH02_MultipleCatch {
    public static void main(String[] args) {
        System.out.println("[ExceptionHandelling] EH02_MultipleCatch: start");
        try {
            String s = null;
            if (args.length > 0) {
                int idx = Integer.parseInt(args[0]);
                int[] a = new int[1];
                System.out.println(a[idx]);
            }
            System.out.println(s.length());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        System.out.println("[ExceptionHandelling] EH02_MultipleCatch: end");
    }
}
