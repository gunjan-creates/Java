package END_SEM.Unit_4.Set;
import java.util.*;
public class TreeSet {
    public static void main(String[]args){
        Set<Integer> i = new java.util.TreeSet<>();
        i.add(123);
        i.add(567);
        i.add(890);
        Iterator<Integer> it = i.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
