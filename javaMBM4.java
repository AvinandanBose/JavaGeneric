import java.util.HashMap;
import java.util.Map;

public class javaMBM4 {

    public static <T extends HashMap<String, String> & Map<String, String>> String addValue(T map,String Key, String value) {

       
        return map.put(Key, value);
        
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        addValue(map, "1", "One");
        addValue(map, "2", "Two");
        addValue(map, "3", "Three");
        addValue(map, "4", "Four");
        addValue(map, "5", "Five");
        System.out.println(map);
    }
    
}
