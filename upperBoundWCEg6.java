import java.util.Map;
import java.util.TreeMap;

interface I{

}
interface J{

}
public class upperBoundWCEg6<T extends Map<? extends TreeMap<? extends I,? extends J> , ? extends TreeMap<? extends I,? extends J>> > {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        upperBoundWCEg6<TreeMap<TreeMap<I, J>, TreeMap<I, J>>> obj = new upperBoundWCEg6<>();
        obj.add(10, 20);

    }
}
