import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;



public class javaGenericsSet14<T> {
    static Scanner sc;
    HashSet<T> set = new HashSet<>();
    T[] data;

    javaGenericsSet14(int capacity) {

        data = (T[]) new Integer[capacity];

    }

    public void gen(HashSet<T> set, T[] arr) {
        this.set = set;

        //add Element
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);

        //remove
        set.remove(1);
        System.out.println(set);

        //clear
        set.clear();
        System.out.println(set);
        if(set.isEmpty()){
            addElement();
        }
        //clone
        HashSet<T> cloneSet = (HashSet<T>) set.clone();
        System.out.println(cloneSet);

        //Iterator
        Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //forEachRemaining
        iterator.forEachRemaining(System.out::println);
        set.iterator().forEachRemaining((T s) -> {
            System.out.println(s);
        });

        //CompareTo
        try {
            Iterator<T> iterator1 = set.iterator();
            Iterator<T> iterator2 = cloneSet.iterator();
            while (iterator1.hasNext() && iterator2.hasNext()) {
                int comparison = ((Integer) iterator1.next()).compareTo((Integer) iterator2.next());
                System.out.println(comparison);
            }
        }

        catch (Exception e) {
            System.out.println("Exception");

        }
        System.out.println(set);
        //iterator.remove
        try {
            Iterator<T> iterator3 = set.iterator();
            T s ;
            sc = new Scanner(System.in);
            System.out.println("Enter the value to remove:");
            int value = sc.nextInt();
            while (iterator3.hasNext()) {
                s = iterator3.next();
                if (s.equals(value)) {
                    iterator3.remove();
                }
            }
            System.out.println(set);
        }

        catch (Exception e) {
            System.out.println("Exception");

        }

        // [Union]AddAll

        set.addAll(cloneSet);
        System.out.println(set);

        // [Intersection] retainAll
        set.retainAll(cloneSet);
        System.out.println(set);

        //Spliterator
        Spliterator<T> numbers = set.spliterator();
        numbers.forEachRemaining((n) -> System.out.println("Numbers:" + n));

        //Contains
        Boolean b = set.contains(2);
        System.out.println(b);

        //Size
        int size = set.size();
        System.out.println(size);

        //isEmpty
        Boolean c = set.isEmpty();
        System.out.println(c);

        //containsAll
        Boolean d = set.containsAll(cloneSet);
        System.out.println(d);

        //removeIf
        set.removeIf((T s) -> s.equals(2));
        System.out.println(set);

        //stream
        set.stream().forEach((T s) -> System.out.println(s));
        System.out.println("\n");

        //parallelStream
        set.parallelStream().forEach((T s) -> System.out.println(s));
        System.out.println("\n");

        //toArray
        Object[] arr1 = set.toArray();
        for (Object o : arr1) {
            System.out.println("Num:"+o);
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println("Num:" + i+"="+arr1[i]);
        }

        //toArray(T[] a)
        T[] arr2 = (T[]) new Integer[set.size()];
        arr2 = set.toArray(arr2);
        for (T o : arr2) {
            System.out.println("NumInt:"+o);
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println("NumberInteger:" + i+"="+arr2[i]);
        }

        //equals
        Boolean e = set.equals(cloneSet);
        System.out.println(e);

        //toString
        String str = set.toString();
        System.out.println(str);

        //hashCode
        int hash = set.hashCode();
        System.out.println(hash);

        //removeAll
        set.removeAll(cloneSet);
        System.out.println(set);

        

    }
    void addElement(){
        sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the array:");
        int capacity = sc.nextInt();
        javaGenericsSet14<Integer> setDemo = new javaGenericsSet14<>(capacity);
        for (int i = 0; i < setDemo.data.length; i++) {
            System.out.println("index:" + i + " value:");
            setDemo.data[i] = sc.nextInt();
        }
        addEl(data);
    }

    //add element
    void addEl(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the array:");
        int capacity = sc.nextInt();
        javaGenericsSet14<Integer> setDemo = new javaGenericsSet14<>(capacity);
        for (int i = 0; i < setDemo.data.length; i++) {
            System.out.println("index:" + i + " value:");
            setDemo.data[i] = sc.nextInt();
        }

        setDemo.gen(setDemo.set, setDemo.data);
        System.out.println(setDemo.set);
    }
}
  