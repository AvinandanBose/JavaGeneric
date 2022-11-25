public class java_generics6<T>{
    T[] data;
    public static void main(String[] args) {
        java_generics6<Integer> p1;
        p1 = new java_generics6<Integer>();
        p1.data = new Integer[2];
        p1.data[0] = 1;
        p1.data[1] = 2;
        for (Integer i =0 ; i < p1.data.length; i++) {
            System.out.println(p1.data[i]);
        }
         
    }
    
}
