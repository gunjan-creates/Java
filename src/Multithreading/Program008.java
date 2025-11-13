package Multithreading;

/**
 * Demonstrates map operations - Example 8
 */
public class Program008 {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Key8", 8);
        map.put("Key9", 9);
        System.out.println("Map: " + map);
        System.out.println("Keys: " + map.keySet());
    }
}
