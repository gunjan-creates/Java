package DS;

/**
 * Demonstrates collection initialization - Example 47
 */
public class Program047 {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int i = 47; i < 52; i++) {
            list.add(i);
        }
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
    }
}
