package Collections;

/**
 * Demonstrates HashMap containsKey and containsValue
 */
public class HashMapContainsKey {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> ages = new java.util.HashMap<>();
        ages.put("John", 25);
        ages.put("Jane", 30);
        ages.put("Bob", 35);
        
        System.out.println("Ages: " + ages);
        
        System.out.println("\nContains key 'John'? " + ages.containsKey("John"));
        System.out.println("Contains key 'Alice'? " + ages.containsKey("Alice"));
        
        System.out.println("\nContains value 30? " + ages.containsValue(30));
        System.out.println("Contains value 40? " + ages.containsValue(40));
    }
}
