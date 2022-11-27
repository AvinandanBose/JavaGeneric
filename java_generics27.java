public class java_generics27<T> {
    T[] data;
    T a;
    T b;

    java_generics27(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T[] getSwappedData(T[] items) {

        for (int i = 0; i < data.length; i++) {
            T temp = data[i];
            data[i] = data[data.length - 1];
            data[data.length - 1] = temp;
        }

        return data;

    }

    public static void main(String[] args) {
        java_generics27<Integer> p1 = new java_generics27<Integer>(1, 2);

        Integer[] c = { p1.a, p1.b };

        p1.getSwappedData(c);

        for (int i = 0; i <= p1.data.length - 1; i++) {
            System.out.println(p1.data[i]);
        }
        Integer res =  p1.a + p1.b; 
        System.out.println(res);

    }

}
