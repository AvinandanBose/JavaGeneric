import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InnnerClass3a<T extends List<? super Number>> {

    private  class InnerClass<V extends Set<? super Number>> {
         V printer( V a) {
            return a;
        }

    }

    
    public static void main(String[] args) {

        InnnerClass3a<ArrayList<Number>> innnerClass1 = new InnnerClass3a<>();
        InnnerClass3a<ArrayList<Number>>.InnerClass<HashSet<Number>> innerClass1 = innnerClass1.new InnerClass<>();

        HashSet<Number> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(innerClass1.printer(set));
       
        

    }
    
}
