package END_SEM.Unit_2.Inheritance;
class Animal12{
    void Show(){
        System.out.println("Hello I am The Animal Class !");
    }
}
class Pet extends Animal12{
    void Show(){
        System.out.println("I Am The Class Pet !");
    }
}
class Dog12 extends Pet{
    void Show(){
        System.out.println("i am the most loved pet animal ! ");
    }
}
public class MultilevelInheritance {
    public static void main(String[]args){
        Animal12 A= new Animal12();
        Pet P = new Pet();
        Dog12 D = new Dog12();
        A.Show();
        P.Show();
        D.Show();
    }
}
