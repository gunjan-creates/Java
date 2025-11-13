package Multithreading;

/**
 * Demonstrates set operations - Example 89
 */
public class Program089 {
    public static void main(String[] args) {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Item89");
        set.add("Item90");
        set.add("Item89"); // duplicate
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
