
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Example2 <T extends Set<? extends  Number> & NavigableSet<? extends Number>>{

    T get(T t) {
        t.forEach(System.out::println);
        return t;
    }

    public static void main(String[] args) {
        Example2<TreeSet<Number>> e = new Example2<>();
        TreeSet<Number> al = new TreeSet<>();
        al.add(1);
        al.add(2);
        al.add(3);

        System.out.println(e.get(al));
    }


}
