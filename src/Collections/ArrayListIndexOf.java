package Collections;

import java.util.ArrayList;

/**
 * Demonstrates indexOf and lastIndexOf operations in ArrayList
 */
public class ArrayListIndexOf {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("B");
        letters.add("D");
        
        System.out.println("Letters: " + letters);
        
        // Find index of element
        int indexB = letters.indexOf("B");
        System.out.println("\nFirst occurrence of 'B' at index: " + indexB);
        
        int lastIndexB = letters.lastIndexOf("B");
        System.out.println("Last occurrence of 'B' at index: " + lastIndexB);
        
        // Element not found returns -1
        int indexE = letters.indexOf("E");
        System.out.println("Index of 'E': " + indexE);
        
        // Finding index of first and last element
        System.out.println("\nIndex of 'A': " + letters.indexOf("A"));
        System.out.println("Index of 'D': " + letters.indexOf("D"));
    }
}
