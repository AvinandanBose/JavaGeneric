public class javaMBM8 {

    public static <T extends Object & Comparable<T>> void test(T t, T t1) {

        System.out.println(t.compareTo(t1));
    }
    public static void main(String[] args) {
        test("a", "b");
        test(1, 2);
        test(1.0, 1.0);
       
    }
    
}
