public class java_generics18<A, B> {
    A data1;
    B data2;
    int a;
    String b;

    java_generics18(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public A view1(A item) {
        data1 = item;
        return data1;
    }

    public B view2(B b2) {
        data2 = b2;
        return data2;
    }

    public static void main(String[] args) {
        java_generics18<Integer, String> p1;
        p1 = new java_generics18<>(190, "Hello");

        System.out.println(p1.view1(p1.a));
        System.out.println(p1.view2(p1.b));
    }

}
