
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javaGenericsSet9<T> {
    HashSet<T> set = new HashSet<>();
    Integer[] arr = new Integer[10];

    javaGenericsSet9(HashSet<T> set, Integer[] arr) {
        this.set = set;
        this.arr = arr;
        for (int i = 0; i < arr.length; i++) {
            set.add((T) arr[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Integer[] intArray = new Integer[10];

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("index:" + i + " value:");
                intArray[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        javaGenericsSet9<Integer> setDemo = new javaGenericsSet9<>(new HashSet<>(), intArray);

        System.out.println(setDemo.set);

    }
}
