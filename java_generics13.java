public class java_generics13<T> {
    T[] data;

    java_generics13(int capacity) {
        data = (T[]) new Object[capacity];
    }

    public static void main(String[] args) {
        java_generics13<Object> p1;
        p1 = new java_generics13<>(2);
        p1.data[0] = 1;
        p1.data[1] = 2;
        for(Integer i =0 ; i < p1.data.length ; i++){
            System.out.println(p1.data[i]);
        }
    
    }
}
