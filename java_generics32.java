public class java_generics32<T> {
    Integer add(T a, T b) {
        Integer a1 = (Integer) a;
        Integer b1 = (Integer) b;
        return (a1 + b1);
    }

    Integer add(T a, T b, T c) {
        Integer a1 = (Integer) a;
        Integer b1 = (Integer) b;
        Integer c1 = (Integer) c;
        return (a1 + b1 + c1);
    }

    public static void main(String[] args) {
        java_generics32<Integer> a = new java_generics32<Integer>();
        System.out.println(a.add(1, 2));
        System.out.println(a.add(20, 30, 40));
    }
}
