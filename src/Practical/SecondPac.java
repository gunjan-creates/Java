package Practical;
// Create Java classes that use static data members and methods.
class Student{
    static int SerialNo = 0;
    String Name;
    int RollNo;
    Student(String Name , int RollNo){
        this.Name=Name;
        this.RollNo=RollNo;
        SerialNo++;
    }
    static void ShowStudentData(){
        System.out.println("The number of student is : "+SerialNo);
    }
    void Display(){
        System.out.println("Name : "+ Name +" , Roll No : "+RollNo );
    }
}
public class SecondPac {
    public static void main(String[]args){
        Student S = new Student("Gunjan",01);
        Student s1 = new Student("Aryan", 02);
        Student s3 = new Student("Suyog",03);
        S.Display();
        s1.Display();
        s3.Display();
        S.ShowStudentData();
    }
}
