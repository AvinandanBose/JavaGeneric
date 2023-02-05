import java.util.HashSet;
import java.util.Set;
public class javaUBM20<T extends Set<Integer>> {
    public  <T extends Set<Integer>> Boolean addValue(T t, Integer val) {
        
        return t.add(val);
        
    }

    public  <T extends Set<Integer>> Boolean containValue(T t, Integer val) {

        return t.contains(val);

    }

    public static void main(String[] args) {
        javaUBM20<HashSet<Integer>> obj = new javaUBM20<>();
        Set<Integer> set = new HashSet<>();
        obj.addValue(set,1);
        obj.addValue(set,2);
        obj.addValue(set,3);
        obj.addValue(set,4);
        obj.addValue(set,5);
        System.out.println(set);
        System.out.println(obj.containValue(set, 1));
        System.out.println(obj.containValue(set, 2));
        System.out.println(obj.containValue(set, 3));
        System.out.println(obj.containValue(set, 4));
        System.out.println(obj.containValue(set, 5));
        System.out.println(obj.containValue(set, 6));
    }
    
}
