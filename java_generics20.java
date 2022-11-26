public class java_generics20<A,B> {

    int a;
    String b;

    java_generics20(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public static <A> void view(A item) {
        System.out.println("The value is: " + item);

    }

    public static <B> String view2(B item) {
        return (String) item;

    }

    public static void main(String[] args) {
        java_generics20<Integer,String> p1;
        p1 = new java_generics20<>(1, "apple");

        view(p1.a);
        view(p1.b);
        System.out.println(view2(p1.b));

    }

}
