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

public class Car{
    String Brand;
    Engine engine;
    public Car(String Brand, Engine engine){
        this.Brand=Brand;
        this.engine=engine;
    }
    void DisplayCar(){
        System.out.println("Car Brand : "+Brand);
        System.out.println("Engine Brand : "+engine);
    }
}
