package Collections;

/**
 * Demonstrates HashMap put operations
 */
public class HashMapPut {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        
        // Put key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        System.out.println("HashMap: " + map);
        
        // Put returns previous value if key exists
        Integer prev = map.put("Alice", 26);
        System.out.println("\nPrevious value for Alice: " + prev);
        System.out.println("Updated HashMap: " + map);
    }
}
