package StringExceptionHandling;

/**
 * Demonstrates set operations - Example 99
 */
public class Program099 {
    public static void main(String[] args) {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Item99");
        set.add("Item100");
        set.add("Item99"); // duplicate
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
