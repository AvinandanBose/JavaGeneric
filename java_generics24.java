public class java_generics24 {

    public static <T> void swap(T[] a) {

        for (int i = 0; i <= a.length - 1; i++) {
            T temp = a[i];
            a[i] = a[a.length - 1];
            a[a.length - 1] = temp;

        }

    }
    
    public static <T> void print(T[] a) {
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {

        Integer[] a = {1, 2, 3, 4, 5};
        String[] b = {"one", "two", "three", "four", "five"};

        swap(a);
        swap(b);
        print(a);
        print(b);

    }
}
