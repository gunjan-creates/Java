package Collections;

/**
 * Demonstrates size and clear operations in HashSet
 */
public class HashSetSizeAndClear {
    public static void main(String[] args) {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        
        System.out.println("Initial size: " + set.size());
        
        set.add("Java");
        set.add("Python");
        set.add("C++");
        
        System.out.println("After adding elements: " + set);
        System.out.println("Size: " + set.size());
        
        set.clear();
        System.out.println("\nAfter clear: " + set);
        System.out.println("Size: " + set.size());
    }
}
