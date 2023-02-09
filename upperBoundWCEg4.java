import java.util.Map;
import java.util.TreeMap;

interface E{

}
interface F{

}
public class upperBoundWCEg4<T extends Map<? extends TreeMap<E,F> , ? extends TreeMap<E,F>> > {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        upperBoundWCEg4<TreeMap<TreeMap<E, F>, TreeMap<E, F>>> obj = new upperBoundWCEg4<>();
        obj.add(10, 20);

    }
}




