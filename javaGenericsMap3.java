import java.util.HashMap;
public class javaGenericsMap3<T,V> {

    javaGenericsMap3(HashMap<T,V> map,T t, V v) {
        map.put(t, v); 

        

        map.forEach((key, value) -> System.out.println(key + " : " + value));
        
        System.out.println(map);

        

    }

    public static void main(String[] args) {
        HashMap<Long, String> map = new HashMap<>();
        javaGenericsMap3<Long, String> javamap = new javaGenericsMap3<>(map, 1L, "2");
        javaGenericsMap3<Long, String> javamap2 = new javaGenericsMap3<>(map, 3L, "4");
        javaGenericsMap3<Long, String> javamap3 = new javaGenericsMap3<>(map, 5L, "6");
        javaGenericsMap3<Long, String> javamap4 = new javaGenericsMap3<>(map, 7L, "8");
        javaGenericsMap3<Long, String> javamap5 = new javaGenericsMap3<>(map, 9L, "10");
    }

    
}
