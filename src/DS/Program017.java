package DS;

/**
 * Demonstrates collection initialization - Example 17
 */
public class Program017 {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int i = 17; i < 22; i++) {
            list.add(i);
        }
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
    }
}
