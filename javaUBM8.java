import java.util.ArrayList;
import java.util.List;
public class javaUBM8 {

    public static <T extends List<String>> void addValue (T value, String name) {
        value.add(name);
      
    }

    public static<T extends List<String>> String getValue(T value,int index) {
        return value.get(index);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        addValue(list, "Avinandan");
        addValue(list, "Bose");
        addValue(list, "MyName");
        System.out.println(list);
        System.out.println(getValue(list,0));
        System.out.println(getValue(list, 1));
       
    }

    
    
}
