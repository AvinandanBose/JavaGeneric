import java.util.HashMap;

public class javaGenericsMap2<T, V> {

    HashMap<T, V> map = new HashMap<>();

    public static void main(String[] args) {
        javaGenericsMap2<Integer, String> javamap = new javaGenericsMap2<>();
        javamap.map.put(1, "2");
        javamap.map.put(3, "4");
        javamap.map.put(5, "6");
        javamap.map.put(7, "8");
        javamap.map.put(9, "10");

       
        System.out.println(javamap.map);
    }
    
}
