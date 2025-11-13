package Collections;

import java.util.LinkedList;

/**
 * Demonstrates LinkedList peek operations
 */
public class LinkedListPeek {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
        System.out.println("List: " + list);
        
        // peek() - retrieves but doesn't remove first element
        String peeked = list.peek();
        System.out.println("\nPeeked element: " + peeked);
        System.out.println("List after peek: " + list);
        
        // peekFirst() - same as peek()
        String peekFirst = list.peekFirst();
        System.out.println("\nPeek first: " + peekFirst);
        
        // peekLast() - retrieves last element
        String peekLast = list.peekLast();
        System.out.println("Peek last: " + peekLast);
        System.out.println("List unchanged: " + list);
        
        // peek on empty list returns null
        LinkedList<String> emptyList = new LinkedList<>();
        System.out.println("\nPeek on empty list: " + emptyList.peek());
    }
}
