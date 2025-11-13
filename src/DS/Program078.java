package DS;

/**
 * Demonstrates map operations - Example 78
 */
public class Program078 {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Key78", 78);
        map.put("Key79", 79);
        System.out.println("Map: " + map);
        System.out.println("Keys: " + map.keySet());
    }
}
