import java.util.HashSet;
import java.util.Scanner;
public class javaGenericsSet10<T> {
    static Scanner sc;
    HashSet<T> set = new HashSet<>();
    Integer[] arr = new Integer[10];

    javaGenericsSet10(HashSet<T> set, Integer[] arr) {
        this.set = set;
        this.arr = arr;
        for (int i = 0; i < arr.length; i++) {
            set.add((T) arr[i]);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Integer[] intArray = new Integer[10];
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("index:" + i + " value:");
            intArray[i] = sc.nextInt();
        }
        javaGenericsSet10<Integer> setDemo = new javaGenericsSet10<>(new HashSet<>(), intArray);
        System.out.println(setDemo.set);
    }
}
