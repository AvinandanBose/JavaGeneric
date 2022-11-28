public class java_generics38<U, V> {

    public  <T, S> int add(U a, V b) {
        int a1 = (int) a;
        int b1 = (int) b;
        return (a1 + b1);

    }

    public static <T, S> int add(T a, S b, T c) {
        int a1 = (int) a;
        int b1 = (int) b;
        int c1 = (int) c;
        return (a1 + b1 + c1);
    }

    public static void main(String[] args) {
        java_generics38<Integer, Integer> a = new java_generics38<Integer, Integer>();
        System.out.println(a.add(1, 2));
        System.out.println(add(20, 30, 40));
    }

}