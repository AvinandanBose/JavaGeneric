public class javaMBM9<T extends Number & Comparable<T>> {
    public  <T extends Number & Comparable<T>> void test(T t, T t1) {

        System.out.println(t.compareTo(t1));
    }

    public static void main(String[] args) {
        javaMBM9<Integer> j = new javaMBM9<>();
        j.test(1, 2);
        j.test(1.0, 1.0);
        j.test(1.0f, 1.2f);
        j.test(1L, 2L);
        j.test(1.0d, 1.0d);
    }
    
}
