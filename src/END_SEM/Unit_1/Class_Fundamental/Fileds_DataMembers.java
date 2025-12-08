package END_SEM.Unit_1.Class_Fundamental;
class company{
    // instance Variable 
    String Name  = "Gunjan";
    // static variables
    static String Company = "Google ";
    void Show(){
        System.out.println("Name : "+Name);
        System.out.println("Company : "+Company);
    }
}
public class Fileds_DataMembers {
    public static void main(String[]args){
        company C1 = new company();
        C1.Show();
    }
}
