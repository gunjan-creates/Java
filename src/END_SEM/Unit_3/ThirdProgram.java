package END_SEM.Unit_3;

public class ThirdProgram {
    public static void main(String[] args) {
        // Demonstrating control structures
        System.out.println("=== Control Structures Demo ===");
        
        // If-else statement
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        
        // For loop
        System.out.println("\nCounting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // While loop
        System.out.println("\nWhile loop example:");
        int counter = 0;
        while (counter < 3) {
            System.out.println("Counter: " + counter);
            counter++;
        }
    }
}
