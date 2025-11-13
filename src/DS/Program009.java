package DS;

/**
 * Demonstrates set operations - Example 9
 */
public class Program009 {
    public static void main(String[] args) {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Item9");
        set.add("Item10");
        set.add("Item9"); // duplicate
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
