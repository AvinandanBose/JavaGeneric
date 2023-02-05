import java.util.HashMap;
import java.util.Map;
public class javaUBM17<T extends Map<String, String>> {

    public  <T extends Map<String, String>> void addValue (T map, String key, String value) {
        map.put(key, value);
      
    }

    public <T extends Map<String, String>> String getValue(T map,String key) {
        return map.get(key);
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        javaUBM17<Map<String, String>> ubm17 = new javaUBM17<>();
        ubm17.addValue(map, "Avinandan", "Bose");
        ubm17.addValue(map, "MyName", "Avinandan");
        ubm17.addValue(map, "Tilte", "Bose");
        System.out.println(map);
        System.out.println(ubm17.getValue(map,"Tilte"));
        System.out.println(ubm17.getValue(map, "MyName"));
        System.out.println(ubm17.getValue(map, "Avinandan"));
       
    }
    
}
