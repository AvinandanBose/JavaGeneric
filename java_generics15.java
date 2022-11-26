public class java_generics15<T> {
    T data;
    int a;
    int b;

    java_generics15(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int view(T item) {

        data = item;
        return (Integer) data; //(int) data; → For primitive type
    }

    public static void main(String[] args) {
        java_generics15<Integer> p1;
        p1 = new java_generics15<>(1, 2);

        System.out.println(p1.view(p1.a));
        System.out.println(p1.view(p1.b));

    }
}
