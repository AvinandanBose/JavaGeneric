public class java_generics16<T> {
    T data;
    int a;
    int b;

    java_generics16(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public T view(T item){
        data = item;
        return  item;
    }
    public static void main(String[] args) {
        java_generics16<Integer> p1;
        p1 = new java_generics16<>(1, 2);

        System.out.println(p1.view(p1.a));
        System.out.println(p1.view(p1.b));

    }
    
}
