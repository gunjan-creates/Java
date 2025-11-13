package Collections;

import java.util.ArrayList;

/**
 * Demonstrates remove operations in ArrayList
 */
public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green"); // duplicate
        
        System.out.println("Original list: " + colors);
        
        // Remove by index
        colors.remove(0);
        System.out.println("After removing index 0: " + colors);
        
        // Remove by object (removes first occurrence)
        colors.remove("Green");
        System.out.println("After removing 'Green': " + colors);
        
        // Remove last element
        colors.remove(colors.size() - 1);
        System.out.println("After removing last element: " + colors);
    }
}
