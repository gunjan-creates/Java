package DS;

/**
 * Demonstrates collection initialization - Example 97
 */
public class Program097 {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int i = 97; i < 102; i++) {
            list.add(i);
        }
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
    }
}
