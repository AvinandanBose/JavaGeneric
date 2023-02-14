import java.util.Map;
import java.util.HashMap;
public class LowerBoundWildCard14 {
    public  static void main(String[] args){
        Map<? super String, ? super Number> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println(map);
        map.remove("b");
        System.out.println(map);
    }
    
}
