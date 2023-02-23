import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaGenMUB17<T extends Set<Number> & NavigableSet<Number>> {

    T value;
  public JavaGenMUB17(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


    

    public static void main(String[] args) {
        TreeSet<Number> map = new TreeSet<>();
 
        JavaGenMUB17<TreeSet<Number>> obj = new JavaGenMUB17<>(map);
        obj.getValue().add(1);
        obj.getValue().add(2);
        obj.getValue().add(3);
        obj.getValue().add(4);
        System.out.println(obj.getValue());
        obj.setValue(map);
        obj.getValue().add(1.02f);
        obj.getValue().add(2.02009);
        obj.getValue().add(3);
        System.out.println(obj.getValue());
    }
    
}
