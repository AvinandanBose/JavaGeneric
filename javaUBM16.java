import java.util.ArrayList;
import java.util.List;
public class javaUBM16 <T extends List<String>>{

    public <T extends List<String>> void addValue (T value, String name) {
        value.add(name);
      
    }

    public <T extends List<String>> String getValue(T value,int index) {
        return value.get(index);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        javaUBM16<List<String>> ubm16 = new javaUBM16<>();
        ubm16.addValue(list, "Avinandan");
        ubm16.addValue(list, "Bose");
        ubm16.addValue(list, "MyName");
        System.out.println(list);
        System.out.println(ubm16.getValue(list,0));
        System.out.println(ubm16.getValue(list, 1));
       
    }
    
}
