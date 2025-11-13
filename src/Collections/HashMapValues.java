package Collections;

/**
 * Demonstrates HashMap values operation
 */
public class HashMapValues {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> scores = new java.util.HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);
        scores.put("David", 88);
        
        System.out.println("Scores: " + scores);
        
        java.util.Collection<Integer> values = scores.values();
        System.out.println("\nAll scores: " + values);
        
        // Calculate average
        int sum = 0;
        for (int score : values) {
            sum += score;
        }
        System.out.println("Average: " + (sum / values.size()));
    }
}
