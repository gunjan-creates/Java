package END_SEM.Unit_2.Polymorphism;
// mathod overloading
class Math{
    void Add(int a, int b){
        System.out.println(a+b);
    }
    void Add(float a , float b){
        System.out.println(a+b);
    }
    void Add(double a , double b){
        System.out.println(a+b);
    }
}
public class Polymorphism {
    public static void main(String[]args){
        Math M =  new Math();
        M.Add(1.2, 1.2);
        M.Add(12.23, 12.25);
        M.Add(12, 14);
    }
}
