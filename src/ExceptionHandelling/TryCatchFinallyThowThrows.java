package ExceptionHandelling;

public class TryCatchFinallyThowThrows {
    static void checkAge(int age) throws Exception {
        if(age < 18)
            throw new Exception("Not Eligible");
        System.out.println("Eligin=ble");
    }
    public static void main(String[] args) {
        try{
            checkAge(15);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Execution completed");
        }
    }
}
