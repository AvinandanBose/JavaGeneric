import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InnnerClass7<T> {
    
    <T extends ArrayList<String> & List<String>> T test(T t){
        int num = 23;
        class MethodInner<V extends HashSet<String> & Set<String>> {
            public void print() {
                System.out.println("This is method inner class " + num);
            }
        }
        
        MethodInner<HashSet<String>> inner = new MethodInner<HashSet<String>>();
        inner.print();  
        
        return t;
    }

    public static void main(String[] args) {
        InnnerClass7<String> outer = new InnnerClass7<String>();

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(outer.test(list));

    }
}
