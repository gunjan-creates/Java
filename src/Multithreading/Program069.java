package Multithreading;

/**
 * Demonstrates set operations - Example 69
 */
public class Program069 {
    public static void main(String[] args) {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Item69");
        set.add("Item70");
        set.add("Item69"); // duplicate
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
