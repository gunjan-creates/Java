package Collections;

/**
 * Demonstrates HashMap putAll operation
 */
public class HashMapPutAll {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> map1 = new java.util.HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        
        java.util.HashMap<String, Integer> map2 = new java.util.HashMap<>();
        map2.put("C", 3);
        map2.put("D", 4);
        
        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);
        
        map1.putAll(map2);
        System.out.println("\nAfter putAll:");
        System.out.println("Map1: " + map1);
    }
}
