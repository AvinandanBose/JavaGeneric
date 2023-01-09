public class javaGenUBEg4<T extends Comparable<T>> {
  
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }

    public static void main(String[] args) {
        javaGenUBEg4<Integer> obj = new javaGenUBEg4<Integer>();
        System.out.println(obj.compare(10, 20));
        System.out.println(obj.compare(20, 10));
        System.out.println(obj.compare(20, 20));

    }
    
}
