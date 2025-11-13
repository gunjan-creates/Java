package Multithreading;

/**
 * Demonstrates map operations - Example 38
 */
public class Program038 {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Key38", 38);
        map.put("Key39", 39);
        System.out.println("Map: " + map);
        System.out.println("Keys: " + map.keySet());
    }
}
