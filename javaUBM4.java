public class javaUBM4<T extends Comparable<T>> {
     <T extends Comparable<T>> int test(T a, T b) {
        return a.compareTo(b);
    }

    public static void main(String[] args) {
         javaUBM4<Integer> j = new javaUBM4<>();
         System.out.println(j.test(2, 1));
    }
    
}
