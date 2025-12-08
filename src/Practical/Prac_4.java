package Practical;

interface Vehicle {
    void start();
}

abstract class AbstractCar implements Vehicle {
    abstract void fuelType();

    public void start() {
        System.out.println("Starting the Car using the key!");
    }
}

class Sedan extends AbstractCar {
    public void fuelType() {
        System.out.println("This car's fuel type is Diesel!");
    }
}

public class Prac_4 {
    public static void main(String[] args) {
        AbstractCar c = new Sedan();
        c.start();
        c.fuelType();
    }
}
