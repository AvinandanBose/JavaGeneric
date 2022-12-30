
import java.util.HashSet;
public class javaGenericsSet1<T> {

    HashSet<T> set = new HashSet<>();

    public static void main(String[] args) {
        javaGenericsSet1<Integer> setDemo = new javaGenericsSet1<>();
        setDemo.set.add(1);
        setDemo.set.add(2);
        setDemo.set.add(3);
        setDemo.set.add(4);
        System.out.println(setDemo.set);

    }
    
    
}
