package Collections;

/**
 * Demonstrates TreeSet basic operations with natural ordering
 */
public class TreeSetBasics {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> set = new java.util.TreeSet<>();
        set.add(50);
        set.add(20);
        set.add(70);
        set.add(10);
        set.add(30);
        
        System.out.println("TreeSet (sorted): " + set);
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());
    }
}
