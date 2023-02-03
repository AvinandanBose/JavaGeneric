import java.util.HashMap;
import java.util.Map;

public class JavaGenMUB10<T extends HashMap<String, String> & Map<String, String>> {
    T map;

    public JavaGenMUB10(T map) {
        this.map = map;
    }

    public void put(String string, String string2) {
        map.put(string, string2);
    }

    public String get(String string) {
        return map.get(string);
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        map.put("key6", "value6");
        JavaGenMUB10<HashMap<String, String>> javaMap = new JavaGenMUB10<>(map);
        
        System.out.println(javaMap.map);
        System.out.println(javaMap.get("key1"));
        javaMap.put("key7", "value7");
        System.out.println(javaMap.map);
    }
}

    

