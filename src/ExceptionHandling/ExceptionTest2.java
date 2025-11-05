package ExceptionHandling;
import java.util.Scanner;
public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            System.out.println("Starting exception handling test...");

            // This will throw an ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.err.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.print("Enter the mass in KG : ");
            int Mass;
            Scanner sc = new Scanner(System.in);
            Mass = sc.nextInt();
            int SpeedOfLight = 300000000;
            long Energy = Mass * SpeedOfLight * SpeedOfLight;
            System.out.println("The energy is: " + Energy + " Joules");
            System.out.println("This is the simple demostration of block finally for understanding its use. using the equeation of the conservation of mass and energy E=mc^2");
        }
    }
}
