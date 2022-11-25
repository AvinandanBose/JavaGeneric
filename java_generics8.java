public class java_generics8<T> {
    T[] data;
    java_generics8(int capacity) {
        data = (T[]) new Object[capacity];
    }
   public static void main(String[] args) {
        java_generics8<Integer> p1;
        p1 = new java_generics8<Integer>(2);
        p1.data[0] = 1;
        p1.data[1] = 2;
        for (Integer i =0 ; i < p1.data.length; i++) {
            System.out.println(p1.data[i]);
        }
         
    }
    
    
}
