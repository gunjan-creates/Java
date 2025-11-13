package Collections;

/**
 * Demonstrates TreeSet subset operations
 */
public class TreeSetSubSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> set = new java.util.TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        
        System.out.println("Original set: " + set);
        System.out.println("\nHeadSet (< 5): " + set.headSet(5));
        System.out.println("TailSet (>= 5): " + set.tailSet(5));
        System.out.println("SubSet [3, 8): " + set.subSet(3, 8));
    }
}
