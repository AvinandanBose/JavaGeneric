import java.util.Arrays;

public class java_generics25<T> {
    T[] data;
    public java_generics25(int capacity) {
        data = (T[]) new Object[capacity];
    }
    public void add(T item) {
        for (int i = 0; i <= data.length-1; i++) {
            if (data[i] == null) {
                data[i] = item;
                break;
            }
        }
    }	
    public static void main(String[]args){
        java_generics25<Integer> p1;
        p1 = new java_generics25<>(5);
        p1.add(1);
        p1.add(2);
        p1.add(3);
        p1.add(4);
        p1.add(5);
        System.out.println(Arrays.toString(p1.data));
        java_generics25<String> p2;
        p2 = new java_generics25<>(5);
        p2.add("A");
        p2.add("B");
        p2.add("C");
        p2.add("D");
        p2.add("E");
        System.out.println(Arrays.toString(p2.data));
    }
    
    
}
