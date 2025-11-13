package Collections;

/**
 * Demonstrates HashMap merge operation
 */
public class HashMapMerge {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> inventory = new java.util.HashMap<>();
        inventory.put("Apples", 10);
        inventory.put("Bananas", 5);
        
        System.out.println("Initial inventory: " + inventory);
        
        // Merge - adds if absent, else applies function
        inventory.merge("Apples", 5, (old, add) -> old + add);
        inventory.merge("Oranges", 8, (old, add) -> old + add);
        
        System.out.println("\nAfter merge:");
        System.out.println("Inventory: " + inventory);
    }
}
