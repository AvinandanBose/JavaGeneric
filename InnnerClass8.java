import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InnnerClass8<T> {

    <T extends List<? super Number>>T test(T t){
        int num = 23;
        class MethodInner<V extends Set<? super Number>> {
            public void print() {
                System.out.println("This is method inner class " + num);
            }
        }
        
        MethodInner<HashSet<Number>> inner = new MethodInner<HashSet<Number>>();
        inner.print();  
        
        return t;
    }

    public static void main(String[] args) {
        InnnerClass8<String> outer = new InnnerClass8<String>();

        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(outer.test(list));

    }


    
}
