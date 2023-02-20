import java.util.HashMap;
import java.util.Map;

public class ClassAndMethod3<T extends Map<? extends String, ? extends  Number>> {

        public T get(T t) {
            t.forEach((k, v) -> System.out.println(k + " " + v));
            return t;
        }

        public static void main(String[] args) {
            ClassAndMethod3<Map<String, Number>> c = new ClassAndMethod3<>();
            HashMap<String, Number> al = new HashMap<>();
            al.put("One", 1);
            al.put("Two", 2);
            al.put("Three", 3);
            al.put("Four", 4);
            System.out.println(c.get(al));
        }
}
