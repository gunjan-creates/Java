package END_SEM.Unit_4;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.TimerThread;
enum Day {Monday , Friday , Tueday}
public class MapS {
    public static void main(String[]args){
        // Hash Map
        HashMap<Integer , String> Hm = new HashMap<>();
        Hm.put(2,"Gunjan");
        Hm.put(1,"Sick");
        System.out.println(Hm);
        // Linked Hash Map
        LinkedHashMap<Integer , String> map = new LinkedHashMap<>();
        map.put(12, "gunjan");
        map.put(11,"him");
        System.out.println(map);
        // Tree Map
        TreeMap<Integer , String> ThM = new TreeMap<>();
        ThM.put(1,"gunjan");
        ThM.put(0,"hun");
        System.out.println(ThM);
        // Identity Hash Map 
        IdentityHashMap<Integer , String> IhM = new IdentityHashMap<>();
        String a = new String("gunjan");
        String b = new String("someone else ");
        IhM.put(12, a);
        IhM.put(34, b);
        System.out.println(IhM);
        // weak Hash Map
        WeakHashMap<Integer ,String> WhM = new WeakHashMap<>();
        Integer key = new Integer(100);
        map.put(1, "gunjan");
        key = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("After Gc  : "+WhM);
        // enum  map
        EnumMap <Day , String> Em= new EnumMap<>(Day.class);
        Em.put(Day.Monday, "hello ");
    }
}
