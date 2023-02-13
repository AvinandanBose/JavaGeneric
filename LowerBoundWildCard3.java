import java.util.AbstractMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

interface E {

}

interface F {

}
public class LowerBoundWildCard3<T extends Map<? super TreeMap<E, F>, ? super TreeMap<E, F>>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        LowerBoundWildCard3<TreeMap<TreeMap<E, F>, TreeMap<E, F>>> obj = new LowerBoundWildCard3<>();
        LowerBoundWildCard3<TreeMap<Object, Object>> obj1 = new LowerBoundWildCard3<>();
        LowerBoundWildCard3<TreeMap<Map<E, F>, Map<E, F>>> obj2 = new LowerBoundWildCard3<>();
        LowerBoundWildCard3<TreeMap<SortedMap<E, F>, Map<E, F>>> obj3 = new LowerBoundWildCard3<>();
        LowerBoundWildCard3<TreeMap<NavigableMap<E, F>, Map<E, F>>> obj4 = new LowerBoundWildCard3<>();
        LowerBoundWildCard3<TreeMap<AbstractMap<E, F>, Map<E, F>>> obj5 = new LowerBoundWildCard3<>();

        obj.add(10, 20);
        obj1.add(10, 20);
        obj2.add(10, 20);
        obj3.add(10, 20);
        obj4.add(10, 20);
        obj5.add(10, 20);
        System.out.println("Done");
    }	
}

    
    

