package DS;

/**
 * Demonstrates set operations - Example 49
 */
public class Program049 {
    public static void main(String[] args) {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Item49");
        set.add("Item50");
        set.add("Item49"); // duplicate
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
