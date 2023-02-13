
import java.util.List;
import java.util.AbstractList;
import java.util.ArrayList;

class A {
}
public class LowerBoundWildCard<T extends List<? super ArrayList<A>>> {

    

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        LowerBoundWildCard<ArrayList<AbstractList<A>>> obj = new LowerBoundWildCard<>();
        LowerBoundWildCard<ArrayList<ArrayList<A>>> obj1 = new LowerBoundWildCard<>();
        LowerBoundWildCard<ArrayList<Object>> obj2 = new LowerBoundWildCard<>();

        obj.add(10, 20);
        obj1.add(10, 20);
        obj2.add(10, 20);

    }
    
}
