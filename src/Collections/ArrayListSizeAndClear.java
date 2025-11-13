package Collections;

import java.util.ArrayList;

/**
 * Demonstrates size and clear operations in ArrayList
 */
public class ArrayListSizeAndClear {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        
        System.out.println("Initial size: " + animals.size());
        System.out.println("Is empty? " + animals.isEmpty());
        
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        
        System.out.println("\nAfter adding elements: " + animals);
        System.out.println("Current size: " + animals.size());
        System.out.println("Is empty? " + animals.isEmpty());
        
        // Clear all elements
        animals.clear();
        System.out.println("\nAfter clear(): " + animals);
        System.out.println("Size after clear: " + animals.size());
        System.out.println("Is empty? " + animals.isEmpty());
    }
}
