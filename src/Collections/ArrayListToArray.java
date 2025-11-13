package Collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Demonstrates toArray operation in ArrayList
 */
public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");
        
        System.out.println("ArrayList: " + languages);
        
        // Convert to Object array
        Object[] objectArray = languages.toArray();
        System.out.println("\nObject array: " + Arrays.toString(objectArray));
        
        // Convert to String array (typed array)
        String[] stringArray = new String[languages.size()];
        stringArray = languages.toArray(stringArray);
        System.out.println("String array: " + Arrays.toString(stringArray));
        
        // Using toArray with new array
        String[] arr = languages.toArray(new String[0]);
        System.out.println("Using toArray(new String[0]): " + Arrays.toString(arr));
        
        // Iterate through array
        System.out.println("\nIterating through array:");
        for (String lang : arr) {
            System.out.println("- " + lang);
        }
    }
}
