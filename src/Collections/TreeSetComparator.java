package Collections;

/**
 * Demonstrates TreeSet with custom comparator
 */
public class TreeSetComparator {
    public static void main(String[] args) {
        // Natural ordering
        java.util.TreeSet<String> natural = new java.util.TreeSet<>();
        natural.add("zebra");
        natural.add("apple");
        natural.add("BANANA");
        System.out.println("Natural ordering: " + natural);
        
        // Custom comparator (case-insensitive)
        java.util.TreeSet<String> custom = new java.util.TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        custom.add("zebra");
        custom.add("apple");
        custom.add("BANANA");
        System.out.println("Case-insensitive: " + custom);
    }
}
