package END_SEM.Unit_4;

public class FourthProgram {
    public static void main(String[] args) {
        // Demonstrating arrays and methods
        System.out.println("=== Arrays and Methods Demo ===");
        
        // Array declaration and initialization
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Array elements:");
        printArray(numbers);
        
        int total = calculateSum(numbers);
        System.out.println("\nSum of array elements: " + total);
        
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
    }
    
    // Method to print array elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + ": " + arr[i]);
        }
    }
    
    // Method to calculate sum
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    // Method to calculate average
    public static double calculateAverage(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }
}
