public class javaMBM1 {
    public static <T extends Number & Comparable<T>> void test(T t, T t1) {

        System.out.println(t.compareTo(t1));
    }

    public static void main(String[] args) {
        test(1,-2);
        test(1.0,1.0);
        test(1.0f,1.2f);
        test(1L, 2L);
        test(1.0d,1.0d);
    }

}
