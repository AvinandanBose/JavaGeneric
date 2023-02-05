import java.util.ArrayList;
import java.util.List;
public class javaMBM13 <T extends ArrayList<String> & List<String>> {
    public  <T extends ArrayList<String> & List<String>> Boolean addValue(T list, String val) {
        return list.add(val);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        javaMBM13 <ArrayList<String>> obj = new javaMBM13 <>();
        obj.addValue(list, "One");
        obj.addValue(list, "Two");
        obj.addValue(list, "Three");
        obj.addValue(list, "Four");
        obj.addValue(list, "Five");
        System.out.println(list);
    }
}
