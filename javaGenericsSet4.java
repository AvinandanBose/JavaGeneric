import java.util.HashSet;
public class javaGenericsSet4 <T>{
    int sum = 0;
    public void add(HashSet<T> set, T data, T data1){
        set.add(data);
        set.add(data1);
        System.out.println("Set:"+ set);
        set.forEach((T t) -> {
            
            sum = sum + (Integer) t;
            
        });                             
        System.out.println("Sum of elements in set:"+ sum);
    }
    public static void main(String[] args) {
        javaGenericsSet4<Integer> setDemo = new javaGenericsSet4<>();
        setDemo.add(new HashSet<>(), 1, 2);
}
}
