package END_SEM.Unit_4.Set;
import java.util.*;
public class Hashset {
    public static void main(String[]args){
        Set<Integer> i = new HashSet<>();
        i.add(123);
        i.add(234);
        Iterator<Integer> it = i.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
