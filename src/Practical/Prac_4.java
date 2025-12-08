package Practical;

interface Vehicle {
    void start();
}

abstract class Car implements Vehicle {
    abstract void fuelType();

    public void start() {
        System.out.println("Starting the Car using the key!");
    }
}

class Sedan extends Car {
    public void fuelType() {
        System.out.println("This car's fuel type is Diesel!");
    }
}

public class Prac_4 {
    public static void main(String[] args) {
        Car c = new Sedan();
        c.start();
        c.fuelType();
    }
}
