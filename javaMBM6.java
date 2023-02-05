import java.util.HashSet;
import java.util.Set;

public class javaMBM6 {

    public static <T extends HashSet<String> & Set<String>> Boolean addValue(T set,String  val) {
        return set.add(val);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        addValue(set, "One");
        addValue(set, "Two");
        addValue(set, "Three");
        addValue(set, "Four");
        addValue(set, "Five");
        System.out.println(set);
    }
    
}
