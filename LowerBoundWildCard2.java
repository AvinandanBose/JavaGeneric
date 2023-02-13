import java.util.AbstractSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


interface D {

}

public class LowerBoundWildCard2<T extends Set<? super TreeSet<D>>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        LowerBoundWildCard2<TreeSet<TreeSet<D>>> obj = new LowerBoundWildCard2<>();
        LowerBoundWildCard2<TreeSet<Object>> obj1 = new LowerBoundWildCard2<>();
        LowerBoundWildCard2<TreeSet<Set<D>>> obj2 = new LowerBoundWildCard2<>();
        LowerBoundWildCard2<TreeSet<AbstractSet<D>>> obj3 = new LowerBoundWildCard2<>();
        LowerBoundWildCard2<TreeSet<NavigableSet<D>>> obj4 = new LowerBoundWildCard2<>();
        LowerBoundWildCard2<TreeSet<SortedSet<D>>> obj5 = new LowerBoundWildCard2<>();


        obj.add(10, 20);
        obj1.add(10, 20);
        obj2.add(10, 20);
        obj3.add(10, 20);
        obj4.add(10, 20);
        obj5.add(10, 20);

    }
    
}
