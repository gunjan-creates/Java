package END_SEM.Unit_2.Polymorphism;
class A{
    void show(){
        System.out.println("hello world");
    }
}
class B extends A{ 
    void show(){
        System.out.println("hello from first child ");
    }
}
class c  extends A{
    void show(){
        System.out.println("hello from second class !");
    }
}
public class overriding {
    public static void main(String[]args){
        A a = new A();
        a.show();
        B b = new B();
        b.show();
        c C = new c();
        C.show();
    }
}
