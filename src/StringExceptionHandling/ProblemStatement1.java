package StringExceptionHandling;
import java.util.Scanner;
    /** Question 1 — Divide by Zero Exception
    Write a program to divide two integers entered by the user. If the denominator is 0, handle the
    ArithmeticException and display an error message.  Useing try-catch block */
public class ProblemStatement1 {
    public static void  main(String[]args){
        int A ;
        int B;
        Scanner sc  = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        A=sc.nextInt();
        B = sc1.nextInt();
        try{
            int result = A/B;
            System.out.println("Result of this operation is : "+result );
        }catch(ArithmeticException e){
            System.err.println("The Execution Caught An Error : "+e.getMessage());
        }
        finally{
            System.out.println("If The Error Are Resolved You Are LUCKY the Code Is Running Successfully Happy Coding !");
        }
        sc.close();
        sc1.close();
    }
}
