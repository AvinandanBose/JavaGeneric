import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
public class Example5<T extends Map<? super  String, ? super Number > & NavigableMap<? super  String, ? super Number >> {

    T get1(T t1, String s, Number n) {
        t1.put(s, n);
        return t1;
    }

    public static void main(String[] args) {
        Example5<TreeMap<String, Number>> e1 = new Example5<>();
        TreeMap<String, Number> al1 = new TreeMap<>();
        e1.get1(al1, "One", 1);
        e1.get1(al1, "Two", 2);
        e1.get1(al1, "Three", 3);
        e1.get1(al1, "Four", 4);
        e1.get1(al1, "Five", 5).forEach((k,v) -> System.out.println(k + " " + v));
        System.out.println("al = " + al1);
    }
}
