import java.util.ArrayList;
import java.util.List;
public class javaMBM5 {
    public static <T extends ArrayList<String> & List<String>> Boolean addValue(T list,String  val) {
        return list.add(val);
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        addValue(list, "One");
        addValue(list, "Two");
        addValue(list, "Three");
        addValue(list, "Four");
        addValue(list, "Five");
        System.out.println(list);
    }
    
}
