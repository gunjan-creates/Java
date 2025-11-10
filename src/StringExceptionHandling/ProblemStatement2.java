package StringExceptionHandling;

import java.util.Scanner;

/**
 * Question 2 — Array Index Out of Bounds
 * Create an integer array of size 5. Try to access the 10th element and handle the
 * ArrayIndexOutOfBoundsException.
 * Hint: Use try-catch and print 'Invalid array index!'.
 */
public class ProblemStatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] OneD = new int[5];

        // Taking input for the array
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < OneD.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            OneD[i] = sc.nextInt();
        }
        /**Printing The Element Onto The Console  */
         for(int i = 0; i<OneD.length;i++){
                System.out.println(OneD[i]);
         }

        // Trying to access 10th element (index 9)
        try {
            System.out.println("The 10th element is: " + OneD[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        sc.close();
    }
}
