package StringExceptionHandling;

/**
 * Demonstrates collection initialization - Example 37
 */
public class Program037 {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int i = 37; i < 42; i++) {
            list.add(i);
        }
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
    }
}
