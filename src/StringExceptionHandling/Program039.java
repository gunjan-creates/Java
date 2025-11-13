package StringExceptionHandling;

/**
 * Demonstrates set operations - Example 39
 */
public class Program039 {
    public static void main(String[] args) {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Item39");
        set.add("Item40");
        set.add("Item39"); // duplicate
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
