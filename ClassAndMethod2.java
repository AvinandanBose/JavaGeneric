import java.util.HashSet;
import java.util.Set;

public class ClassAndMethod2<T extends Set<? extends Number>> {

        public T get(T t) {
            t.forEach(System.out::println);
            return t;
        }

        public static void main(String[] args) {
            ClassAndMethod2<Set<Number>> c = new ClassAndMethod2<>();
            HashSet<Number> al = new HashSet<>();
            al.add(1);
            al.add(2);
            al.add(3);
            al.add(4);
            System.out.println(c.get(al));
        }
}
