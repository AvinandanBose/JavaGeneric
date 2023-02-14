import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

public class LowerBoundWildCard8 {


    
    public static <T extends Map<? super String, ? super Number>> T test(T t, Integer a, String b) {

      t.put(b, a);
        System.out.println("List elements: " + t);

        for (Object n : t.keySet()) {
            System.out.println("keys = " + n);
        }

        for (Object n : t.values()) {
            System.out.println("Values = " + n);
        }

        Iterator<? super String> it = t.keySet().iterator();
        while (it.hasNext()) {
            System.out.println("Keys =" + it.next());
        }

        Iterator<? super Number> it1 = t.values().iterator();
        while (it1.hasNext()) {
            System.out.println("Values =" + it1.next());
        }

        Iterable<? super String> it2 = t.keySet();
        for (Object num : it2) {
            System.out.println("Values =" + num);
        }

        Iterable<? super Number> it3 = t.values();
        for (Object num : it3) {
            System.out.println("Values =" + num);
        }

        return t;

    }

    public static void main(String[] args) {
        Map<String, Number> map = new java.util.HashMap<>();
        Map<String, Serializable> map1 = new java.util.HashMap<>();
        Map<String, Object> map2 = new java.util.HashMap<>();
        Map<Object, Number> map3 = new java.util.HashMap<>();
        Map<Object, Serializable> map4 = new java.util.HashMap<>();
        Map<Object, Object> map5 = new java.util.HashMap<>();
        
        test(map, 1, "a");
        test(map, 2, "b");
        test(map, 3, "c");
        test(map1, 2, "d");
        test(map2, 3, "e");
        test(map3, 4, "f");
        test(map4, 5, "g");
        test(map5, 6, "h");

    }
}
