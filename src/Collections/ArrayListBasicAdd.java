package Collections;

import java.util.ArrayList;

/**
 * Demonstrates basic add operations in ArrayList
 */
public class ArrayListBasicAdd {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        System.out.println("Fruits list: " + fruits);
        
        // Adding element at specific index
        fruits.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + fruits);
        
        // Adding multiple elements
        fruits.add("Grapes");
        fruits.add("Pineapple");
        
        System.out.println("Final list: " + fruits);
        System.out.println("Total fruits: " + fruits.size());
    }
}
