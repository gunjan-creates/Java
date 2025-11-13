package Collections;

/**
 * Demonstrates HashMap remove operations
 */
public class HashMapRemove {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> map = new java.util.HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        System.out.println("Original map: " + map);
        
        String removed = map.remove(2);
        System.out.println("\nRemoved value: " + removed);
        System.out.println("After removal: " + map);
        
        // Remove with value check
        boolean removed2 = map.remove(3, "Three");
        System.out.println("\nRemoved 3->Three: " + removed2);
        System.out.println("Final map: " + map);
    }
}
