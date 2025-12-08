// create a java program based on the given requirements Demonstrate the has-a relationship
// Requirements : create class named engine with the suitable attribute and display method , create another class named car that has an object of engine (has a relationship)
// initialize and display details using object method .
// compile and run the java program 
package Practical;

public class FirstPrac {
    public static void main(String[]args){
        Engine E = new Engine("V8", 500);
        E.displayEngine();
        Car C = new Car("Rolls royce", E);
        C.DisplayCar();
    }
}
