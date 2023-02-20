import java.util.ArrayList;
import java.util.List;

public class ClassAndMethodL1<T extends List<? super Number>> {

        public T get(T t, Integer a) {
            t.add(a);

            return t;
        }

        public static void main(String[] args) {
            ClassAndMethodL1<ArrayList<Number>> c = new ClassAndMethodL1<>();
            ArrayList<Number> al1 = new ArrayList<>();
            c.get(al1, 1);
            c.get(al1, 2);
            c.get(al1, 3);
            c.get(al1, 4);
            c.get(al1, 5).forEach(System.out::println);
            System.out.println("al1 = " + al1);

        }
}
