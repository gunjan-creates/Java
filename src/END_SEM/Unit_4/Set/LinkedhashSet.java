package END_SEM.Unit_4.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashSet {
    public static void main(String[]args){
        Set<Integer> it = new LinkedHashSet<>();
        it.add(1223);
        it.add(123);
        Iterator<Integer> i = it.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
