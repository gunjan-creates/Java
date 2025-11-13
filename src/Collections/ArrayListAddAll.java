package Collections;

import java.util.ArrayList;

/**
 * Demonstrates ArrayList addAll operation
 */
public class ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Orange");
        list2.add("Mango");
        
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        
        // Add all elements from list2 to list1
        list1.addAll(list2);
        System.out.println("\nAfter addAll:");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        
        // Add all elements at specific index
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Grapes");
        list3.add("Pineapple");
        
        list1.addAll(1, list3);
        System.out.println("\nAfter addAll at index 1:");
        System.out.println("List 1: " + list1);
    }
}
