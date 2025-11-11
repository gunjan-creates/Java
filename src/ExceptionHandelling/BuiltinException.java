package ExceptionHandelling;

public class BuiltinException {
    public static void main(String[] args) {
        int[] arr = new int[2];
        try{
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Out OF Range");
        }
    }
}
