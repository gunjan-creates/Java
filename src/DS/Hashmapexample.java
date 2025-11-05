package DS;
import java.util.*;
public class Hashmapexample {
    public static void main(String[]args){
        // creation of the hashmap of which contains two values 1st is Of name in the form of string and 2nd is country code of the type of integer lest take the example of the country and country code or the city and the pin code 
        HashMap<String , Integer> Hmap = new HashMap<>();
        // insertion of the values 
        Hmap.put("nagpur",480108);
        Hmap.put("india",91);
        System.out.println("Hash map :"+Hmap);
    }
}
