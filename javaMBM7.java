import java.util.ArrayList;

public class javaMBM7 {

    public static <T extends CharSequence & Comparable<T>> ArrayList<T> test(T t, T t1) {
        ArrayList<T> list = new ArrayList<>();
        if(t.compareTo(t1) > 0){
            list.add(t1);
        }    
        else if (t.compareTo(t1) < 0){
            list.add(t);
        }
        else if (t.compareTo(t1) == 0){
            list.add(t);
            list.add(t1);
        }

         
        return list;
    }

    public static void main(String[] args) {
        System.out.println(test("a", "b"));
        System.out.println(test("b", "a"));
        System.out.println(test("a", "a"));
       
        

    }
}
   
