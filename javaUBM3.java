public class javaUBM3<T extends Number> {
    <T extends Number> void test(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        javaUBM3<Integer> j = new javaUBM3<Integer>();
        j.test(1);
        j.test(1.0);
        j.test(1.0f);
        j.test(1L);
        j.test(1.0d);
    }
    
}
