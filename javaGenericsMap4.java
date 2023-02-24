import java.util.HashMap;
public class javaGenericsMap4<T, V> {
    javaGenericsMap4(HashMap<T,V> map,T t, V v){
        map.put(t, v);
        Long sum = map.keySet().stream().mapToLong(key -> (long) key).sum();
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        HashMap<Long, String> map = new HashMap<>();
        javaGenericsMap4<Long, String> javamap = new javaGenericsMap4<>(map, 1L, "2");
        javaGenericsMap4<Long, String> javamap2 = new javaGenericsMap4<>(map, 3L, "4");
        javaGenericsMap4<Long, String> javamap3 = new javaGenericsMap4<>(map, 5L, "6");
        javaGenericsMap4<Long, String> javamap4 = new javaGenericsMap4<>(map, 7L, "8");
        javaGenericsMap4<Long, String> javamap5 = new javaGenericsMap4<>(map, 9L, "10");
    }
}
