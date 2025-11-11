package ExceptionHandelling;
public class JvmReactionToException {
    static void method1(){
        method2();
    }
    static void method2(){
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        method1();//JVM searches call stack for handler
    }
}
