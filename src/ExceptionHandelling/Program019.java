package ExceptionHandelling;

/**
 * Demonstrates set operations - Example 19
 */
public class Program019 {
    public static void main(String[] args) {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Item19");
        set.add("Item20");
        set.add("Item19"); // duplicate
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
