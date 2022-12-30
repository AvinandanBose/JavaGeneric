import java.util.HashSet;
public class javaGenericsSet6<T> {
    HashSet<T> set = new HashSet<>();
    static Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    javaGenericsSet6(HashSet<T> set) {
        this.set = set;
        for (int i = 0; i < arr.length; i++) {
            set.add((T) arr[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {

        javaGenericsSet6<Integer> setDemo = new javaGenericsSet6<>(new HashSet<>());

        System.out.println(setDemo.set);

    }
}
