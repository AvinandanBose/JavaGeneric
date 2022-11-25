public class java_generics10<T> {
    T[] data;

    public static void main(String[] args) {
        java_generics10<Integer> p1;
        p1 = new java_generics10<Integer>();
        p1.data = new Integer[2];
        p1.data[0] = 1;
        p1.data[1] = 2;
        for (Integer dataset : p1.data) {
            System.out.println(dataset);
        }
    }

}
