public class java_generics31<T> {
    int add(T a, T b) {
        int a1 = (int)a;
        int b1 = (int) b;
        return (a1+b1);
    }

    int add(T a, T b, T c) {
        int a1 = (int) a;
        int b1 = (int) b;
        int c1 = (int) c;
        return (a1+b1+c1);
    }

    public static void main(String[] args) {
        java_generics31<Integer> a = new java_generics31<Integer>();
        System.out.println(a.add(1, 2));
        System.out.println(a.add(20, 30, 40));
    }
    
}
