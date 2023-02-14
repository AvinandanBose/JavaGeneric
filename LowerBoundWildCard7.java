import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

public class LowerBoundWildCard7 {
    public static <T extends Set<? super Number>> T test(T t, Integer a) {

        t.add(a);

        System.out.println("List elements: " + t);

        for (Object n : t) {
            System.out.println(n);
        }

        Iterator<? super Number> it = t.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterable<? super Number> it2 = t;
        for (Object s : it2) {
            System.out.println(s);
        }

        return t;
    }

    public static void main(String[] args) {
        Set<Number> set = new java.util.HashSet<>();
        Set<Serializable> set1 = new java.util.HashSet<>();
        Set<Object> set2 = new java.util.HashSet<>();
        test(set, 1);
        test(set, 2);
        test(set, 3);
        test(set1, 2);
        test(set2, 3);

    }

}
