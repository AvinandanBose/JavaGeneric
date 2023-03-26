import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InnnerClass3<T extends ArrayList<String> & List<String> > {
    private  class InnerClass<V extends HashSet<String> & Set<String>> {
         V printer( V a) {
            return a;
        }

    }

    
    public static void main(String[] args) {

        InnnerClass3<ArrayList<String>> innnerClass1 = new InnnerClass3<>();
        InnnerClass3<ArrayList<String>>.InnerClass<HashSet<String>> innerClass1 = innnerClass1.new InnerClass<>();

        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        System.out.println(innerClass1.printer(set));
       
        

    }
    
}
