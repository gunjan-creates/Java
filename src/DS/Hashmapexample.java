package DS;

import java.util.HashMap;

public class Hashmapexample {
    public static void main(String[] args) {
        // creation of the hashmap which contains two kinds of values: 1st is name (String) and 2nd is a code (Integer)
        HashMap<String, Integer> Hmap = new HashMap<>();

        // insertion of values
        Hmap.put("nagpur", 480108);
        Hmap.put("india", 91);
        System.out.println("Hash map : " + Hmap);

        Hmap.put("borgaon", 480108);
        Hmap.put("usa", 1);
        System.out.println("updated Hash map : " + Hmap);

        // get the value of a particular key
        Integer value = Hmap.get("nagpur");
        System.out.println("the value of nagpur is: " + value);

        // remove a key/value pair
        Hmap.remove("usa");
        System.out.println("after removing 'usa' from the hash map: " + Hmap);

        // check if a key or value is present
        boolean hasIndia = Hmap.containsKey("india");
        System.out.println("is 'india' key present: " + hasIndia);

        boolean hasValue = Hmap.containsValue(480108);
        System.out.println("is value 480108 present: " + hasValue);

        // get the size
        int size = Hmap.size();
        System.out.println("the size of the hash map is: " + size);
    }
}
