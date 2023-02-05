import java.util.HashMap;
import java.util.Map;
public class javaMBM12<T extends HashMap<String, String> & Map<String, String>> {
    public  <T extends HashMap<String, String> & Map<String, String>> String addValue(T map,String Key, String value) {
        return map.put(Key, value);
    }
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        javaMBM12<HashMap<String, String>> obj = new javaMBM12<>();

        obj.addValue(map, "1", "One");
        obj.addValue(map, "2", "Two");
        obj.addValue(map, "3", "Three");
        obj.addValue(map, "4", "Four");                 
        obj.addValue(map, "5", "Five");
        System.out.println(map);
    }
    
}
