package END_SEM.Unit_2.Inheritance;
interface A{
    void DisplayA();
}
interface B{
    void DisplayB();
}
class C{
    void DisplayC(){
        System.out.println("Inside class C " );
    }
}
class D extends C implements A,B{
    @Override
    public void DisplayA(){
        System.out.println("inside interface A");
    }
    public void DisplayB(){
        System.out.println("inside the Interface  B ");
    }
    void DisplayD(){
        System.out.println("inside the D class !");
    }
}
public class HibridInheritance {
    public static void main(String[]args){
        D obj = new D();
        obj.DisplayA();
        obj.DisplayB();
        obj.DisplayC();
        obj.DisplayD();
    }
}
