package Collections;

import java.util.ArrayList;

/**
 * Demonstrates get and set operations in ArrayList
 */
public class ArrayListGetSet {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        System.out.println("Original list: " + numbers);
        
        // Get element at index
        int firstElement = numbers.get(0);
        System.out.println("Element at index 0: " + firstElement);
        
        int lastElement = numbers.get(numbers.size() - 1);
        System.out.println("Last element: " + lastElement);
        
        // Set/update element at index
        numbers.set(2, 35);
        System.out.println("After setting index 2 to 35: " + numbers);
        
        // Update first element
        numbers.set(0, 15);
        System.out.println("After updating first element: " + numbers);
    }
}
