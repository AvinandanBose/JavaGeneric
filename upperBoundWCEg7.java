import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

interface K{

}
interface L{

}

public class upperBoundWCEg7<T extends Map<? extends TreeMap<? extends K,? extends L> , ? extends TreeMap<? extends K,? extends L>> & NavigableMap<? extends TreeMap<? extends K,? extends L> , ? extends TreeMap<? extends K,? extends L>>> {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static  void main(String[] args){

        upperBoundWCEg7<TreeMap<TreeMap<K, L>, TreeMap<K, L>>> obj = new upperBoundWCEg7<>();

        obj.add(30,30);


    }

}
