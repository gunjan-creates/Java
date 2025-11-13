package Collections;

import java.util.LinkedList;

/**
 * Demonstrates LinkedList addFirst and addLast operations
 */
public class LinkedListAddFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // Add elements at the end
        list.add("Middle");
        System.out.println("Initial list: " + list);
        
        // Add at the beginning
        list.addFirst("First");
        System.out.println("After addFirst: " + list);
        
        // Add at the end
        list.addLast("Last");
        System.out.println("After addLast: " + list);
        
        // Multiple additions
        list.addFirst("New First");
        list.addLast("New Last");
        System.out.println("Final list: " + list);
        
        System.out.println("\nSize: " + list.size());
    }
}
