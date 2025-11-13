package Collections;

/**
 * Demonstrates contains operation in HashSet
 */
public class HashSetContains {
    public static void main(String[] args) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        
        System.out.println("Set: " + set);
        
        // Check if element exists
        System.out.println("\nContains 20? " + set.contains(20));
        System.out.println("Contains 50? " + set.contains(50));
        
        // Check and add if not present
        if (!set.contains(50)) {
            set.add(50);
            System.out.println("\nAdded 50. New set: " + set);
        }
    }
}
