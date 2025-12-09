package END_SEM.Unit_2.AbstractClass;
abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("the animal is sleeping !");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bhow ");
    }
}
public class Abstract1 {
    public static void main(String[]args){
        Dog D = new Dog();
        D.sleep();
        D.sound();
    }
}
