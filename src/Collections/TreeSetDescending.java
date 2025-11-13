package Collections;

/**
 * Demonstrates TreeSet descending operations
 */
public class TreeSetDescending {
    public static void main(String[] args) {
        java.util.TreeSet<String> set = new java.util.TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        set.add("Date");
        
        System.out.println("Ascending: " + set);
        System.out.println("Descending: " + set.descendingSet());
        
        System.out.println("\nDescending Iterator:");
        java.util.Iterator<String> it = set.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
