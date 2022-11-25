public class java_generics14<T> {
    T[] data;

    java_generics14(int capacity) {
        data = (T[]) new Object[capacity];
    }

    public static void main(String[] args) {
        java_generics14<Object> p1;
        p1 = new java_generics14<>(2);
        p1.data[0] = 1;
        p1.data[1] = 2;
        for(Object i : p1.data) {
            System.out.println(i);
        }

    }
}