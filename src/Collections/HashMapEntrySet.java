package Collections;

/**
 * Demonstrates HashMap entrySet operation
 */
public class HashMapEntrySet {
    public static void main(String[] args) {
        java.util.HashMap<String, String> phonebook = new java.util.HashMap<>();
        phonebook.put("Alice", "555-1234");
        phonebook.put("Bob", "555-5678");
        phonebook.put("Charlie", "555-9012");
        
        System.out.println("Phonebook entries:");
        for (java.util.Map.Entry<String, String> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
