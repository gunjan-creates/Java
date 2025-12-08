// create a java program based on the given requirements Demonstrate the has-a relationship
// Requirements : create class named engine with the suitable attribute and display method , create another class named car that has an object of engine (has a relationship)
// initialize and display details using object method .
// compile and run the java program 
package Practical;
class Engine{
    String Type;
    int Horsepower;
    Engine(String Type,int Horsepower){
        this.Type = Type;
        this.Horsepower = Horsepower;
    }
    void displayEngine(){
        System.out.println("Details Of the Engine : ");
        System.out.println("Type Of the display : "+ Type);
        System.out.println("Horse power of the engine : "+Horsepower+" BHP");
    }
}
class Car{
    String Brand;
    Engine engine;
    Car(String Brand, Engine engine){
        this.Brand=Brand;
        this.engine=engine;
    }
    void DisplayCar(){
        System.out.println("Car Brand : "+Brand);
        System.out.println("Engine Brand : "+engine);
    }
}
public class FirstPrac {
    public static void main(String[]args){
        Engine E = new Engine("V8", 500);
        E.displayEngine();
        Car C = new Car("Rolls royce", E);
        C.DisplayCar();
    }
}
