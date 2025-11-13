package Collections;

import java.util.ArrayList;

/**
 * Demonstrates ArrayList iteration methods
 */
public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        
        // Method 1: For loop with index
        System.out.println("Method 1: For loop with index");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + ": " + numbers.get(i));
        }
        
        // Method 2: Enhanced for loop
        System.out.println("\nMethod 2: Enhanced for loop");
        for (Integer num : numbers) {
            System.out.println(num);
        }
        
        // Method 3: forEach with lambda
        System.out.println("\nMethod 3: forEach with lambda");
        numbers.forEach(num -> System.out.println(num));
        
        // Method 4: forEach with method reference
        System.out.println("\nMethod 4: forEach with method reference");
        numbers.forEach(System.out::println);
    }
}
