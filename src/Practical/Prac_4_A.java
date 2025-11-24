package Practical;
interface InterPac4{
    void start();
}
abstract class Car1 implements InterPac4{
    public void start1(){
        System.out.println("Starting the car !");
    }
    abstract void Type();
}
class Car2 extends Car1 {
    public  void Type(){
        System.out.println("the car is sedan !");
    }
    public void start(){
        start1();
    }
}
public class Prac_4_A {
    public static void main(String[] args) {
        Car1 C = new Car2();
        C.Type();
        C.start1();
    }
}
