package DS;

/**
 * Demonstrates map operations - Example 48
 */
public class Program048 {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Key48", 48);
        map.put("Key49", 49);
        System.out.println("Map: " + map);
        System.out.println("Keys: " + map.keySet());
    }
}
