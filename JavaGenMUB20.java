import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;
public class JavaGenMUB20 <T extends NavigableMap<String,Number> & Map<String,Number>>
{

    T value;

    public JavaGenMUB20(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        TreeMap<String, Number> map = new TreeMap<>();
        JavaGenMUB20<TreeMap<String, Number>> obj = new JavaGenMUB20<>(map);
        obj.getValue().put("One", 1);
        obj.getValue().put("Two", 2);
        obj.getValue().put("Three", 3);
        obj.getValue().put("Four", 4);
        System.out.println(obj.getValue());

        obj.setValue(map);

        obj.getValue().put("FloatingVal1", 1.02f);
        obj.getValue().put("FloatingVal2", 2.02009);
        obj.getValue().put("FloatingVal3", 3);
        System.out.println(obj.getValue());
    }
    
}
