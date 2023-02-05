public class javaUBM6 {

    public static <T extends Runnable> void test(T t) {
        System.out.println(t);
        t.run();
    }

    public static void main(String[] args) {
        test(new Thread());
    }
    
}
