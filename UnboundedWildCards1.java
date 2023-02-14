import java.util.List;
import java.util.Set;


public class UnboundedWildCards1<T extends List<Number> & Set<Number>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        UnboundedWildCards1<?> a = new UnboundedWildCards1<>();
        UnboundedWildCards1<?> b = new UnboundedWildCards1<>();
        UnboundedWildCards1<?> c = new UnboundedWildCards1<>();
        // .....etc.

        a.add(1, 2);
        b.add(1, 2);
        c.add(1, 2);
    }


    
}
