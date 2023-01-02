import java.util.HashSet;
import java.util.Scanner;

public class javaGenericsSet13<T> {
    static Scanner sc;
    HashSet<T> set = new HashSet<>();
    T[] data;

    javaGenericsSet13(int capacity) {

        data = (T[]) new Integer[capacity];

    }

    public static <T> void view(HashSet<T> set, T[] arr) {

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);

    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the array:");
        int capacity = sc.nextInt();
        javaGenericsSet13<Integer> setDemo = new javaGenericsSet13<>(capacity);
        for (int i = 0; i < setDemo.data.length; i++) {
            System.out.println("index:" + i + " value:");
            setDemo.data[i] = sc.nextInt();
        }

        view(setDemo.set, setDemo.data);
        System.out.println(setDemo.set);
    }
}
