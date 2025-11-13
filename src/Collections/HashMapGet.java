package Collections;

/**
 * Demonstrates HashMap get operations
 */
public class HashMapGet {
    public static void main(String[] args) {
        java.util.HashMap<String, String> capitals = new java.util.HashMap<>();
        capitals.put("USA", "Washington DC");
        capitals.put("UK", "London");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        
        System.out.println("Capital of France: " + capitals.get("France"));
        System.out.println("Capital of India: " + capitals.get("India"));
        
        // getOrDefault
        String capital = capitals.getOrDefault("India", "Not found");
        System.out.println("\nCapital of India (with default): " + capital);
    }
}
