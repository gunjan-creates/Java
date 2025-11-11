package ExceptionHandelling;

public class ControlFlowOnException {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt("abc");
        }catch(NumberFormatException e){
            System.out.println("Invalid Number");
        }finally{
            System.out.println("Finally Bock is Here !");
        }
    }
}
