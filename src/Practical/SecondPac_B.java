package Practical;
class B{
    static String college= "Rtmssu";
    String Name;
    int year;
    String Roll_No;
    int Sem;
    B(int year,String Roll_No,int Sem,String Name){
        this.Name = Name;
        this.Roll_No = Roll_No;
        this.year=year;
        this.Sem=Sem;
        college = "RTMNU";
    }
    void Display(){
        System.out.println("Name Of The Student : "+Name+"\n Roll No : "+Roll_No+"\n year : "+year+"\n Sem : "+Sem);
    }
}
public class SecondPac_B {
    public static void main(String[]args){
        B b = new B(3, "NIT04", 0, null)
    }
}
