import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Example3 <T extends Map<? extends  String, ? extends Number > & NavigableMap<? extends  String, ? extends Number >>{

    T get(T t) {
        t.forEach((k,v) -> System.out.println(k + " " + v));
        return t;
    }

    public static void main(String[] args) {
        Example3<TreeMap<String, Number>> e = new Example3<>();
        TreeMap<String, Number> al = new TreeMap<>();
        al.put("One", 1);
        al.put("Two", 2);
        al.put("Three", 3);
        al.put("Four", 4);

        System.out.println(e.get(al));
    }
}
