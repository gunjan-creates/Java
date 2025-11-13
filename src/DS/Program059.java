package DS;

/**
 * Demonstrates set operations - Example 59
 */
public class Program059 {
    public static void main(String[] args) {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Item59");
        set.add("Item60");
        set.add("Item59"); // duplicate
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
