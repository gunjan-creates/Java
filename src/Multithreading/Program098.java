package Multithreading;

/**
 * Demonstrates map operations - Example 98
 */
public class Program098 {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Key98", 98);
        map.put("Key99", 99);
        System.out.println("Map: " + map);
        System.out.println("Keys: " + map.keySet());
    }
}
