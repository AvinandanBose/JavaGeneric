import java.util.HashMap;
import java.util.Map;

public class javaGenUBEg10<T extends Map<String, Integer>> {
    
        T value;
    
        public javaGenUBEg10(T value, String name, Integer age) {
            this.value = value;
            value.put(name, age);
        }
    
        public T getValue() {
            return value;
        }
    
        public static void main(String[] args) {
            javaGenUBEg10<Map<String, Integer>> obj = new javaGenUBEg10<>(new HashMap<String, Integer>(), "Avinandan", 25);
            obj.getValue().put("Bose", 25);
            System.out.println(obj.getValue());
            obj.value.put("Shekhar", 25);
            System.out.println(obj.getValue());
            System.out.println(obj.value);
            obj.value.put("Shivam", 66);
            System.out.println(obj.value);
        }

    
}
