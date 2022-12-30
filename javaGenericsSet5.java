import java.util.HashSet;

public class javaGenericsSet5<T> {
    HashSet<T> set = new HashSet<>();

    javaGenericsSet5(HashSet<T> set, T data,T data1, T data2) {
        this.set = set;
        set.add(data);
        set.add(data1);
        set.add(data2);
        System.out.println(set);
    }

    public static void main(String[] args) {
        javaGenericsSet5<Integer> setDemo = new javaGenericsSet5<>(new HashSet<>(), 1,3,5);
        javaGenericsSet5<Integer> setDemo1 = new javaGenericsSet5<>(new HashSet<>(), 2,4,6);

        System.out.println(setDemo.set);
        System.out.println(setDemo1.set);
    }

}
