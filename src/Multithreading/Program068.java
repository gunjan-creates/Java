package Multithreading;

/**
 * Demonstrates map operations - Example 68
 */
public class Program068 {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Key68", 68);
        map.put("Key69", 69);
        System.out.println("Map: " + map);
        System.out.println("Keys: " + map.keySet());
    }
}
