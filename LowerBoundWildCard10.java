import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LowerBoundWildCard10 {
    public static List<? super Number> test(List<? super Number> num, Integer a) {

        num.add(a);

        System.out.println("List elements: " + num);

        for (Object n : num) {
            System.out.println(n);
        }

        Iterator<? super Number> it = num.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterable<? super Number> it2 = num;
        for (Object n : it2) {
            System.out.println(n);
        }


        return num;

    }

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Serializable> list3 = new ArrayList<>();

        test(list, 1);
        test(list, 2);
        test(list, 3);
        test(list1, 2);
        test(list3, 4);
        
        

    }
}
