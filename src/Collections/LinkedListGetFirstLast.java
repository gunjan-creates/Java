package Collections;

import java.util.LinkedList;

/**
 * Demonstrates LinkedList getFirst and getLast operations
 */
public class LinkedListGetFirstLast {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        queue.add("Task 4");
        
        System.out.println("Queue: " + queue);
        
        // Get first element without removing
        String first = queue.getFirst();
        System.out.println("\nFirst element: " + first);
        System.out.println("Queue after getFirst: " + queue);
        
        // Get last element without removing
        String last = queue.getLast();
        System.out.println("\nLast element: " + last);
        System.out.println("Queue after getLast: " + queue);
        
        // Both operations don't modify the list
        System.out.println("\nQueue size: " + queue.size());
    }
}
