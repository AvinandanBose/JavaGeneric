import java.util.HashSet;
import java.util.Set;

public class javaMBM14 <T extends HashSet<String> & Set<String>>{

    public <T extends HashSet<String> & Set<String>> Boolean addValue(T set, String val) {
        return set.add(val);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        javaMBM14 <HashSet<String>> obj = new javaMBM14 <>();
        obj.addValue(set, "One");
        obj.addValue(set, "Two");
        obj.addValue(set, "Three");
        obj.addValue(set, "Four");
        obj.addValue(set, "Five");
        System.out.println(set);
    }
    
}
