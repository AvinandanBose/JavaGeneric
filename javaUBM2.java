public class javaUBM2<T extends Comparable<T>> {

    public static <T extends Comparable<T>> int test(T a, T b) {
       return a.compareTo(b);

        
    }

    public static void main(String[] args) {
       System.out.println(test(2, 1));
    }
    
}
