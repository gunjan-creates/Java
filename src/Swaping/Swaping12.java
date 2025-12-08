package Swaping;

public class Swaping12 {
    public static void main(String[] arg) {
        int a = 10;
        int b = 12;

        System.out.println("Before A : " + a);
        System.out.println("Before B : " + b);

        int temp = a; 
        a = b;
        b = temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
