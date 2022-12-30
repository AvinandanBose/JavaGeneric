import java.util.HashSet;

public class javaGenericsSet7<T> {
    HashSet<T> set = new HashSet<>();
    Integer[] arr = new Integer[10];

    javaGenericsSet7(HashSet<T> set, Integer[] arr) {
        this.set = set;
        this.arr = arr;
        for (int i = 0; i < arr.length; i++) {
            set.add((T) arr[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        Integer[] intArray = { 10, 20, 30, 40, 50, 60, 70, 80 };

        javaGenericsSet7<Integer> setDemo = new javaGenericsSet7<>(new HashSet<>(), intArray);

        System.out.println(setDemo.set);

    }
}
