package Collections;

/**
 * Demonstrates HashMap compute operations
 */
public class HashMapCompute {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        
        System.out.println("Original: " + map);
        
        // compute
        map.compute("A", (k, v) -> v == null ? 1 : v * 2);
        System.out.println("After compute A: " + map);
        
        // computeIfAbsent
        map.computeIfAbsent("C", k -> 3);
        System.out.println("After computeIfAbsent C: " + map);
        
        // computeIfPresent
        map.computeIfPresent("B", (k, v) -> v + 10);
        System.out.println("After computeIfPresent B: " + map);
    }
}
