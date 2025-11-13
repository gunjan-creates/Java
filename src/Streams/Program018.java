package Streams;

/**
 * Demonstrates map operations - Example 18
 */
public class Program018 {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Key18", 18);
        map.put("Key19", 19);
        System.out.println("Map: " + map);
        System.out.println("Keys: " + map.keySet());
    }
}
