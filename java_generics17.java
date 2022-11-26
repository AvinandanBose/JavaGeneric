public class java_generics17<A, B> {
    A data1;
    B data2;
    int a;
    int b;

    java_generics17(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public A view1(A item) {
        data1 = item;
        return data1;
    }

    public B view2(B item) {
        data2 = item;
        return data2;
    }

    public static void main(String[] args) {
        java_generics17<Integer, Integer> p1;
        p1 = new java_generics17<>(190, 2);

        System.out.println(p1.view1(p1.a));
        System.out.println(p1.view2(p1.b));

    }
    
}
