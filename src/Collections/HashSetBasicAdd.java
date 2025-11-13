package Collections;

/**
 * Demonstrates basic add operations in HashSet
 */
public class HashSetBasicAdd {
    public static void main(String[] args) {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        
        // Adding elements
        System.out.println("Adding 'Apple': " + set.add("Apple"));
        System.out.println("Adding 'Banana': " + set.add("Banana"));
        System.out.println("Adding 'Orange': " + set.add("Orange"));
        
        // Adding duplicate - returns false
        System.out.println("Adding 'Apple' again: " + set.add("Apple"));
        
        System.out.println("\nHashSet: " + set);
        System.out.println("Size: " + set.size());
    }
}
