import java.util.ArrayList;

public class javaMBM15<T extends CharSequence & Comparable<T>> {

    
    public  <T extends CharSequence & Comparable<T>> ArrayList<T> test(ArrayList<T> list ,T t, T t1) {
        
        if (t.compareTo(t1) > 0) {
            list.add(t1);
        } else if (t.compareTo(t1) < 0) {
            list.add(t);
        } else if (t.compareTo(t1) == 0) {
            list.add(t);
            list.add(t1);
        }

        return list;
    }

    public static void main(String[] args) {
        javaMBM15<String> j = new javaMBM15<>();
        ArrayList<String> list = new ArrayList<>();
        System.out.println(j.test(list,"a", "b"));
        System.out.println(j.test(list,"b", "a"));
        System.out.println(j.test(list,"a", "a"));
        System.out.println(j.test(list, "a", "c"));


    }
}
