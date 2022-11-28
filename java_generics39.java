public class java_generics39<T, S> {

    public <U, V> int add(U a, S b) {
        int a1 = (int) a;
        int b1 = (int) b;
        return (a1 + b1);

    }
    
    public <U, V> int sub(T a , V b) {
        int a1 = (int) a;
        int b1 = (int) b;
        return (  b1 - a1 );

    }


    public static void main(String[] args) {
        java_generics39<Integer, Integer> a = new java_generics39<Integer, Integer>();
        System.out.println(a.add(1, 2));
        System.out.println(a.sub(20, 30));
        
    }

    
}
