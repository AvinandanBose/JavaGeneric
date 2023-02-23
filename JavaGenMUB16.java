import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

public class JavaGenMUB16<T extends AbstractSet<Number> & Set<Number>> {
    T value;

    public JavaGenMUB16(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        HashSet<Number> set = new HashSet<>();
        JavaGenMUB16<HashSet<Number>> obj = new JavaGenMUB16<>(set);
        obj.getValue().add(1);
        obj.getValue().add(2);
        obj.getValue().add(3);
        obj.getValue().add(4);
        System.out.println(obj.getValue());
        obj.setValue(set);
        obj.getValue().add(1.02f);
        obj.getValue().add(2.02009);
        obj.getValue().add(3);
        System.out.println(obj.getValue());
    }
    
}
