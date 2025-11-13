package Streams;

/**
 * Demonstrates set operations - Example 79
 */
public class Program079 {
    public static void main(String[] args) {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Item79");
        set.add("Item80");
        set.add("Item79"); // duplicate
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
