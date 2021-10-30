import java.util.HashSet;
import java.util.Set;

public class SetUtil<T> {
    public  Set<T> union(Set<T> a, Set<T> b) {
        Set<T> c = new HashSet<>(a);
        c.addAll(b);
        return c;
    }
    public  Set<T> intersect(Set<T> a, Set<T> b) {
        Set<T> c = new HashSet<>(a);
        c.retainAll(b);
        return c;
    }
}
