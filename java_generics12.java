public class java_generics12<T> {
    T[] data;

    java_generics12(int capacity) {
        data = (T[]) new Integer[capacity];
    }

    public static void main(String[] args) {
        java_generics12<Integer> p1;
        p1 = new java_generics12<Integer>(2);
        p1.data[0] = 1;
        p1.data[1] = 2;
        for (Integer i : p1.data) {
            System.out.println(i);
        }

    }

}
