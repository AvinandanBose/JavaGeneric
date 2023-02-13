import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
public class LowerBoundWildCard4 <T extends List<? super Number>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        LowerBoundWildCard4<ArrayList<Number>> obj = new LowerBoundWildCard4<>();
        LowerBoundWildCard4<ArrayList<Object>> obj1 = new LowerBoundWildCard4<>();
        LowerBoundWildCard4<ArrayList<Serializable>> obj2 = new LowerBoundWildCard4<>();

        obj.add(10, 20);
        obj1.add(10, 20);
        obj2.add(10, 20);
    }
}
