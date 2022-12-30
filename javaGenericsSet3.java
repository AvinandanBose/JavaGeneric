import java.util.HashSet;

public class javaGenericsSet3<T> {

    HashSet<T> set = new HashSet<>();

    javaGenericsSet3(HashSet<T> set, T data) {

        set.add(data);
       
        System.out.println(set);
    }

    public static void main(String[] args) {
        javaGenericsSet3<Integer> setDemo = new javaGenericsSet3<>(new HashSet<>(), 1);
        javaGenericsSet3<Integer> setDemo1 = new javaGenericsSet3<>(new HashSet<>(), 2);

        setDemo1.set.add(3);
        setDemo1.set.add(4);
        setDemo1.set.add(5);
        setDemo1.set.add(6);
        setDemo1.set.add(7);
        setDemo1.set.add(8);
        setDemo1.set.add(9);
        setDemo1.set.add(10);
        System.out.println(setDemo1.set);

        setDemo.set.addAll(setDemo1.set);
        System.out.println(setDemo.set);

    }
}
