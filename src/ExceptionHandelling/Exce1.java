package ExceptionHandelling;

public class Exce1 {
    public static void main(String[] args) {
        try{
            int a = 12/0;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("cannot be able to divide by the zero change the denumerator");
        }
    }
}
