package DS;

/**
 * Demonstrates set operations - Example 29
 */
public class Program029 {
    public static void main(String[] args) {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Item29");
        set.add("Item30");
        set.add("Item29"); // duplicate
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
