package END_SEM.Unit_4.List;

import java.util.Iterator;
import java.util.Vector;

public class vectorlist {
    public static void main(String[]args){
        Vector<Integer> V = new Vector<>();
        V.add(12);
        V.add(123);
        V.add(355);
        V.add(123);
        Iterator<Integer> it = V.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
