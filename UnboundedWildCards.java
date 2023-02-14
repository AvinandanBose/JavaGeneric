import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCards<T extends List<?>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        UnboundedWildCards<ArrayList<Integer>> a = new UnboundedWildCards<>();
        UnboundedWildCards<ArrayList<Float>> b = new UnboundedWildCards<>();
        UnboundedWildCards<ArrayList<Double>> c = new UnboundedWildCards<>();
        UnboundedWildCards<ArrayList<Comparable<Number>>> c1 = new UnboundedWildCards<>();
        // .....etc.

        a.add(1, 2);
        b.add(1, 2);
        c.add(1, 2);
        c1.add(1, 2);
    }

}
