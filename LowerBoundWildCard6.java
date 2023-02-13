import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.Serializable;
import java.lang.Iterable;

public class LowerBoundWildCard6 {
    
    public static <T extends List<? super String>> T test (T t, String a) {
        t.add(a);

        if (t.contains("a") == true) {
            t.remove(0);
            System.out.println("value of index: 0 is removed");
        }

        System.out.println("List elements: " + t);

        
        for (Object n : t) {
            System.out.println(n);
        }
        Iterator<? super String> it = t.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Iterable<? super String> it2 = t;
        for (Object n : it2) {
            System.out.println(n);
        }
        return t;


    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Object> list1 = new ArrayList<>();
        List<Serializable> list2 = new ArrayList<>();
        List<Comparable<String>> list3 = new ArrayList<>();
        List<CharSequence> list4 = new ArrayList<>();
        test(list, "a");
        test(list, "b");
        test(list, "c");
        test(list, "d");
        test(list1, "d");
        test(list2, "e");
        test(list3, "f");
        test(list4, "g");
    }
}
