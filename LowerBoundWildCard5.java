import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LowerBoundWildCard5 {

    public static < T extends List < ? super Number > > T test(T t, Integer a) {
        t.add(a);
       
        if (t.contains(1) == true){
            t.remove(0);
            System.out.println("value of index: 0 is removed");
        }

        System.out.println("List elements: " + t);

        for (Object n : t) {
            System.out.println(n);
        }

        Iterator<? super Number> it = t.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterable<? super Number> it2 = t;
        for (Object n : it2) {
            System.out.println(n);
        }



        return t;
    }

    public static void main(String[] args) {
        List<Number> list = new  ArrayList<>();
        List<Serializable> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        test(list, 1);
        test(list, 2);
        test(list, 3);
        test(list1, 2);
        test(list2, 3);

    }
    
}
