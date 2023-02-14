import java.util.ArrayList;
import java.util.Set;

public class UnboundedWildCards2<T extends ArrayList<Number> & Set<Number>> {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        UnboundedWildCards2<?> a = new UnboundedWildCards2<>();
        UnboundedWildCards2<?> b = new UnboundedWildCards2<>();
        UnboundedWildCards2<?> c = new UnboundedWildCards2<>();
        // .....etc.

        a.add(1, 2);
        b.add(1, 2);
        c.add(1, 2);
    }
    
}
