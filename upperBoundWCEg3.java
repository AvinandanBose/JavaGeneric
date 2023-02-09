import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

interface D{

}
public class upperBoundWCEg3<T extends Set<? extends TreeSet<D>> & NavigableSet<? extends TreeSet<D>>> {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        upperBoundWCEg3<TreeSet<TreeSet<D>>> obj = new upperBoundWCEg3<>();
        obj.add(10, 20);

    }


}
