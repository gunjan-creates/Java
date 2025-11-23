package Practical;
class B{
    static String college= "Rtmssu";
    String Name;
    int year;
    String Roll_No;
    int Sem;
    B(int year,String Roll_No,int Sem,String Name,String Input){
        if(!Input.equals(college)){
            System.out.println("You are not the student at "+college+" go to your college website");
        }else{
            System.out.println("Wellcome to RTMSSU Web Support !");
        }
        this.Name = Name;
        this.Roll_No = Roll_No;
        this.year=year;
        this.Sem=Sem;
        college = "RTMSSU";
    }
    void Display(){
        System.out.println("Name Of The Student : "+Name+"\n Roll No : "+Roll_No+"\n year : "+year+"\n Sem : "+Sem+"\n College : "+college);
    }
}
public class SecondPac_B {
    public static void main(String[]args){
        B b = new B(3, "NIT04", 3, "GUNJAN","Rtmssu");
        b.Display();
    }
}
