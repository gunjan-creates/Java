package END_SEM.Unit_4.Set;

import java.util.HashSet;
import java.util.Set;

public class Seteg {
    public static void main(String[]args){
        Set<Integer> st = new HashSet<>();
        st.add(12);
        st.add(123);
        st.add(12);//duplicates ignored
        System.out.println(st);
    }
}
