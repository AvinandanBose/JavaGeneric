import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class JavaGenMUB15<T extends AbstractList<Number> & List<Number>> {
    T value;

    public JavaGenMUB15(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        JavaGenMUB15<ArrayList<Number>> obj = new JavaGenMUB15<>(list);
        obj.getValue().add(1);
        obj.getValue().add(2);
        obj.getValue().add(3);
        obj.getValue().add(4);
        System.out.println(obj.getValue());
        obj.setValue(list);
        obj.getValue().add(1.02f);
        obj.getValue().add(2.02009);
        obj.getValue().add(3);
        System.out.println(obj.getValue());
    }
    
}
