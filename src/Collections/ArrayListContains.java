package Collections;

import java.util.ArrayList;

/**
 * Demonstrates contains operation in ArrayList
 */
public class ArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        
        System.out.println("Cities: " + cities);
        
        // Check if element exists
        boolean hasLondon = cities.contains("London");
        System.out.println("\nContains 'London'? " + hasLondon);
        
        boolean hasBerlin = cities.contains("Berlin");
        System.out.println("Contains 'Berlin'? " + hasBerlin);
        
        // Case sensitive check
        boolean hasNewYork = cities.contains("new york");
        System.out.println("Contains 'new york'? " + hasNewYork);
        
        // Checking with numbers
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        System.out.println("\nNumbers: " + nums);
        System.out.println("Contains 2? " + nums.contains(2));
        System.out.println("Contains 5? " + nums.contains(5));
    }
}
