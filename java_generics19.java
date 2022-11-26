public class java_generics19<T> {
    int a;
    int b;

    java_generics19(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static <T>  void view(T item) {
        System.out.println("The value is: " + item);
        
    }

    public static <T> int view2(T item) {
        return (Integer) item;

    }

   public static void main(String[] args) {
        java_generics19<Integer> p1;
        p1 = new java_generics19<>(1, 2);

        view(p1.a);
        view(p1.b);

        System.out.println(view2(p1.a));
        System.out.println(view2(p1.b));

    }

}
