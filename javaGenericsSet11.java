import java.util.HashSet;
import java.util.Scanner;
public class javaGenericsSet11<T> {
    static Scanner sc;
    HashSet<T> set = new HashSet<>();
   
    T[]arr;
    public void gen (HashSet<T> set ,T[] arr){
        this.set = set;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        javaGenericsSet11<Integer> setDemo1 = new javaGenericsSet11<>();
        setDemo1.arr = new Integer[10];
        for (int i = 0; i < setDemo1.arr.length; i++) {
            System.out.println("index:" + i + " value:");
            setDemo1.arr[i] = sc.nextInt();
        }

        setDemo1.gen(setDemo1.set, setDemo1.arr);
        System.out.println(setDemo1.set);
       
    }
}
