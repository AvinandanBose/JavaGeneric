import java.util.ArrayList;
import java.util.List;

public class javaGenUBEg9<T extends List<String>> {

    T value;
    public javaGenUBEg9(T value,String name) {
        this.value = value;
        value.add(name);
      
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        javaGenUBEg9<List<String>> obj = new javaGenUBEg9<>(new ArrayList<String>(),"Avinandan");
        
        
        obj.getValue().add("Bose");
        System.out.println(obj.getValue());
        obj.value.add("Shekhar");
        System.out.println(obj.getValue());
        System.out.println(obj.value);
    }

    
}
