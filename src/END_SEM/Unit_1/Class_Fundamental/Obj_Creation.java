package END_SEM.Unit_1.Class_Fundamental;
class Student {
    String name = "gunjan";//data{variables}
    int age = 19;//data{variable}
    void Study(){//method 
        System.out.println("I am Studying ");
        System.out.println("Name :  "+name);
        System.out.println("Age : "+age);
    }
}

public class Obj_Creation {
    public static void main(String[] args){
        // creation of the object 
        int a = 12 ;
        // variable = value stored;
        int b = 34;
        // variable = value to be stored;
        System.out.println("the sum of the to numbers are = " + a+b);
        Student S1 = new Student();
        // S1 is a object of the class Student To initialize this 
        S1.Study();
    }
}
