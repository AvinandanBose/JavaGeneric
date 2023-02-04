public class javaUBM1<T extends Number> {

    public static <T extends Number> void test(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        test(1);
        test(1.0);
        test(1.0f);
        test(1L);
        test(1.0d);
    }

}
