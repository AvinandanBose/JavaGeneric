import java.util.ArrayList;
import java.util.List;

public class ClassAndMethod1<T extends List<? extends Number>> {

     T get(T t) {
         t.forEach(System.out::println);
         return t;
     }

     public static void main(String[] args) {
         ClassAndMethod1<ArrayList<Number>> c = new ClassAndMethod1<>();
            ArrayList<Number> al = new ArrayList<>();
            al.add(1);
            al.add(2);
            al.add(3);
            al.add(4);
         System.out.println(c.get(al));
     }

}
