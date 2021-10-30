import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> str = new HashSet<>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.add("d");
        System.out.println(str);

        Set<String> st = new HashSet<>();
        st.add("a");
        st.add("e");
        st.add("c");
        st.add("r");
        System.out.println(st);


        System.out.println(new SetUtil<String>().union(str,st));
        System.out.println(new SetUtil<String>().intersect(str,st));
    }
}
