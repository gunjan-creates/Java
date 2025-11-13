package Collections;

import java.util.ArrayList;

/**
 * Demonstrates isEmpty operation in ArrayList
 */
public class ArrayListIsEmpty {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        
        // Check empty list
        System.out.println("Is list1 empty? " + list1.isEmpty());
        System.out.println("Size of list1: " + list1.size());
        
        // Add element
        list1.add("First");
        System.out.println("\nAfter adding element:");
        System.out.println("Is list1 empty? " + list1.isEmpty());
        System.out.println("Size of list1: " + list1.size());
        
        // Remove element
        list1.remove(0);
        System.out.println("\nAfter removing element:");
        System.out.println("Is list1 empty? " + list1.isEmpty());
        System.out.println("Size of list1: " + list1.size());
        
        // Using isEmpty in conditional logic
        if (list1.isEmpty()) {
            System.out.println("\nList is empty, adding default values");
            list1.add("Default");
        }
        System.out.println("Final list: " + list1);
    }
}
