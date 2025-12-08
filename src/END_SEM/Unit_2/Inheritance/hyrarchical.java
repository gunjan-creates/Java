package END_SEM.Unit_2.Inheritance;
class Animal{
    void Sound(){
        System.out.println("The Animal Has diffremt sounds ");
    }
}
class Cat extends Animal{
    void Sound(){
        System.out.println("CAT : I Do Meow !");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dog : I Do Bhow !");
    }
}
public class hyrarchical {
    public static void main(String[]args){
        Animal A = new Animal();
        A.Sound();
        Cat C =  new Cat();
        C.Sound();
        Dog D = new Dog();
        D.Sound();
    }
}
