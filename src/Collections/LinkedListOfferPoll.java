package Collections;

import java.util.LinkedList;

/**
 * Demonstrates LinkedList offer and poll operations (Queue behavior)
 */
public class LinkedListOfferPoll {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        
        // Offer adds element at the end (returns true if successful)
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        
        System.out.println("Queue after offers: " + queue);
        
        // Poll removes and returns the first element
        String polled = queue.poll();
        System.out.println("\nPolled element: " + polled);
        System.out.println("Queue after poll: " + queue);
        
        // Multiple polls
        System.out.println("\nPolling remaining elements:");
        while (!queue.isEmpty()) {
            System.out.println("Polled: " + queue.poll());
        }
        
        System.out.println("Final queue: " + queue);
        
        // Poll on empty queue returns null
        String nullPoll = queue.poll();
        System.out.println("Poll on empty queue: " + nullPoll);
    }
}
