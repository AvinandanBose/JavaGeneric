import java.util.Map;
import java.util.TreeMap;
import java.util.NavigableMap;

interface G{

}

interface H{

}
public class upperBoundWCEg5<T extends Map<? extends TreeMap<G,H> , ? extends TreeMap<G,H>> & NavigableMap<? extends TreeMap<G,H> , ? extends TreeMap<G,H>>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        upperBoundWCEg5<TreeMap<TreeMap<G, H>, TreeMap<G, H>>> obj = new upperBoundWCEg5<>();
        obj.add(10, 20);

    }
}
