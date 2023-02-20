import java.util.HashSet;
import java.util.Set;
public class ClassAndMethodL2<T extends Set<? super Number>> {
    public T get(T t, Integer a) {
        t.add(a);
        return t;
    }
    public static void main(String[] args) {
        ClassAndMethodL2<Set<Number>> c = new ClassAndMethodL2<>();
        Set<Number> al1 = new HashSet<>();
        c.get(al1, 1);
        c.get(al1, 2);
        c.get(al1, 3);
        c.get(al1, 4);
        c.get(al1, 5).forEach(System.out::println);
        System.out.println("al1 = " + al1);
    }
}
