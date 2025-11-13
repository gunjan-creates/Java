package Collections;

/**
 * Demonstrates TreeSet navigable methods
 */
public class TreeSetNavigable {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> set = new java.util.TreeSet<>();
        for (int i = 10; i <= 100; i += 10) {
            set.add(i);
        }
        
        System.out.println("TreeSet: " + set);
        System.out.println("\nCeiling of 35: " + set.ceiling(35));
        System.out.println("Floor of 35: " + set.floor(35));
        System.out.println("Higher than 50: " + set.higher(50));
        System.out.println("Lower than 50: " + set.lower(50));
    }
}
