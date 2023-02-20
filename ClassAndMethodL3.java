import java.util.Map;
import java.util.HashMap;

public class ClassAndMethodL3<T extends Map<? super String, ? super Number>> {

        public T get(T t, String s, Number n) {
            t.put(s, n);
            return t;
        }

        public static void main(String[] args) {
            ClassAndMethodL3<Map<String, Number>> c = new ClassAndMethodL3<>();
            HashMap<String, Number> al = new HashMap<>();
            c.get(al, "One", 1);
            c.get(al, "Two", 2);
            c.get(al, "Three", 3);
            c.get(al, "Four", 4);
            c.get(al, "Five", 5).forEach((k, v) -> System.out.println(k + " " + v));
            System.out.println("al = " + al);
        }
}
