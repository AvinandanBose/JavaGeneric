import java.util.Set;
import java.util.HashSet;

public class LowerBoundWildCard13 {

    public  static void main(String[] args){
        Set<? super Number> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
    }
    
}
