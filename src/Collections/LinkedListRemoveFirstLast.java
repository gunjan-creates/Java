package Collections;

import java.util.LinkedList;

/**
 * Demonstrates LinkedList removeFirst and removeLast operations
 */
public class LinkedListRemoveFirstLast {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("Original list: " + numbers);
        
        // Remove first element
        int first = numbers.removeFirst();
        System.out.println("\nRemoved first: " + first);
        System.out.println("List after removeFirst: " + numbers);
        
        // Remove last element
        int last = numbers.removeLast();
        System.out.println("\nRemoved last: " + last);
        System.out.println("List after removeLast: " + numbers);
        
        // Remove both ends
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("\nFinal list: " + numbers);
    }
}
