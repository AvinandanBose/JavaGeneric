import java.util.HashMap;
import java.util.Map;
public class javaUBM9 {

    public static <T extends Map<String, String>> void addValue (T map, String key, String value) {
        map.put(key, value);
      
    }

    public static<T extends Map<String, String>> String getValue(T map,String key) {
        return map.get(key);
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        addValue(map, "Avinandan", "Bose");
        addValue(map, "MyName", "Avinandan");
        addValue(map, "Tilte", "Bose");
        System.out.println(map);
        System.out.println(getValue(map,"Tilte"));
        System.out.println(getValue(map, "MyName"));
        System.out.println(getValue(map, "Avinandan"));
       
    }
    
}
