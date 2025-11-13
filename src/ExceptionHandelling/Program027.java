package ExceptionHandelling;

/**
 * Demonstrates collection initialization - Example 27
 */
public class Program027 {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int i = 27; i < 32; i++) {
            list.add(i);
        }
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
    }
}
