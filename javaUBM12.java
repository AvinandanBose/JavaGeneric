import java.util.HashSet;
import java.util.Set;

public class javaUBM12 {
    public static <T extends Set<Integer>> Boolean addValue(T t, Integer val) {
        
        return t.add(val);
        
    }

    public static <T extends Set<Integer>> Boolean containValue(T t, Integer val) {

        return t.contains(val);

    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        addValue(set,1);
        addValue(set,2);
        addValue(set,3);
        addValue(set,4);
        addValue(set,5);
        System.out.println(set);
        System.out.println(containValue(set, 1));
        System.out.println(containValue(set, 2));
        System.out.println(containValue(set, 3));
        System.out.println(containValue(set, 4));
        System.out.println(containValue(set, 5));
        System.out.println(containValue(set, 6));
    }
    
}
