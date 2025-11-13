package Collections;

/**
 * Demonstrates remove operation in HashSet
 */
public class HashSetRemove {
    public static void main(String[] args) {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Yellow");
        
        System.out.println("Original set: " + set);
        
        // Remove element
        boolean removed = set.remove("Green");
        System.out.println("\nRemoved 'Green': " + removed);
        System.out.println("Set after removal: " + set);
        
        // Remove non-existent element
        removed = set.remove("Purple");
        System.out.println("\nRemoved 'Purple': " + removed);
        System.out.println("Final set: " + set);
    }
}
