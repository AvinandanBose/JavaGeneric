import java.util.HashSet;
public class javaGenericsSet2<A,B> {
    HashSet<A> set = new HashSet<>();
    HashSet<B> set1 = new HashSet<>();
    public static void main(String[] args) {
        javaGenericsSet2<Integer, String> setDemo = new javaGenericsSet2<>();
        setDemo.set.add(1);
        setDemo.set.add(2);
        setDemo.set.add(3);
        setDemo.set.add(4);
        System.out.println(setDemo.set);
        setDemo.set1.add("one");
        setDemo.set1.add("two");
        setDemo.set1.add("three");
        setDemo.set1.add("four");
        System.out.println(setDemo.set1);
    }                                           
    
}
