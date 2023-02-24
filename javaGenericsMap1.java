import java.util.HashMap;

public class javaGenericsMap1<T> {

    HashMap<T, T> map = new HashMap<>();

    public static void main(String[] args) {
        javaGenericsMap1<Integer> javamap = new javaGenericsMap1<>();
        javamap.map.put(1, 2);
        javamap.map.put(3, 4);
        javamap.map.put(5, 6);
        javamap.map.put(7, 8);
        javamap.map.put(9, 10);

       
        System.out.println(javamap.map);
    }
    
}
