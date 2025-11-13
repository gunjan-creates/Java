package Collections;

/**
 * Demonstrates HashMap keySet operation
 */
public class HashMapKeySet {
    public static void main(String[] args) {
        java.util.HashMap<String, Double> prices = new java.util.HashMap<>();
        prices.put("Apple", 1.99);
        prices.put("Banana", 0.99);
        prices.put("Orange", 2.49);
        
        System.out.println("Prices: " + prices);
        
        java.util.Set<String> keys = prices.keySet();
        System.out.println("\nKeys: " + keys);
        
        System.out.println("\nIterating over keys:");
        for (String key : keys) {
            System.out.println(key + " costs $" + prices.get(key));
        }
    }
}
