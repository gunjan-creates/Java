package Practical;
// Based on the requirements in OO design assignments, create inheritance hierarchy and implement polymorphism. Create two different hierarchies and test the application.
class Shape{
    void Draw(){
        System.out.println("this is the universal shape ");
    }
}
class Cube extends Shape{
    void Draw(){
        System.out.println("This is the shape Cube ! ");
    }
}
class Triangle extends Shape{
    void Draw(){
        System.out.println("This is the Shape Triangle !");
    }
}
class Animal{
    void Eat(){
        System.out.println("Animal Can Eat ! ");
    }
}
class Dog extends Animal{
    void Eat(){
        System.out.println("Dog Can Eat ! ");
    }
}
class Cat extends Animal{
    void Eat(){
        System.out.println("Cat can Eat");
    }
}
public class Third_Prac {
    public static void main(String[]args){
        Shape Sh = new Shape();
        Sh.Draw();
        Cube Cb = new Cube();
        Cb.Draw();
        Triangle Tr = new Triangle();
        Tr.Draw();
        Animal An = new Animal();
        An.Eat();
        Dog Dg = new Dog();
        Dg.Eat();
        Cat Ct = new Cat();
        Ct.Eat();
    }
}
