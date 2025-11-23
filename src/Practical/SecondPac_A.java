package Practical;
class A{
    static int Count;
    String Name;
    int Number;
    A(String Name , int Number){
        this.Name = Name;
        this.Number = Number;
        Count++;
    }
    static void increment(){
        System.out.println("increment of the user is : "+Count);
    }
    void ShowtheInfo(){
        System.out.println("Name : "+Name+" , Number : "+Number);
    }
}
public class SecondPac_A {
    public static void main(String[] args) {
        A a = new A("gunjan", 968577198);
        A a1 = new A("Abc", 87679809);
        A a2 = new A("CDE", 978627);
        a.ShowtheInfo();
        a1.ShowtheInfo();
        a2.ShowtheInfo();
        a.increment();
    }
}
