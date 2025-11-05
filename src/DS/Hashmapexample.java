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
        Hmap.put("borgaon",480108);
        Hmap.put("usa",1);
        System.out.println("updated Hash map :"+Hmap);
        // to get the value of the perticular key
        int value = Hmap.get("nagpur");
        System.out.println("the value of the nagpur is :"+value);
        // to remove the key value pair from the hashmap

        Hmap.remove("usa");
        System.out.println("after removing the usa from the hash map :"+Hmap);
        // to check the key is present or not in the hashmap
        boolean checkkey = Hmap.containsKey("india");
        System.out.println("is india key is present in the hash map :"+checkkey);
        // to check the value is present or not in the hashmap
        boolean checkvalue = Hmap.containsValue(480108);
        System.out.println("is 480108 value is present in the hash map :"+checkvalue);
        // to get the size of the hashmap
        int size = Hmap.size();
        System.out.println("the size of the hash map is :"+size);
        int n = Hmap.size();
        System.out.println("the size of the hash map is :"+n);
    }
}
