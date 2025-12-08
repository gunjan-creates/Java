package END_SEM.Unit_2.Inheritance;
class Human{
    void Type(){
        System.out.println("I Am the parent class of the humans !");
    }
}
class Homosep{
    void Type(){
        System.out.println("my type of human are still exist on the earth !");
    }
}
public class SingleInheritance {
    public static void main(String[]args){
        Human H = new Human();
        H.Type();
        Homosep H1 =new Homosep();
        H1.Type();
    }
}
