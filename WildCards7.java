
class A {

}

interface B<T> {

}

public class WildCards7<T extends B<? extends A>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        WildCards7<B<A>> obj = new WildCards7<>();
        obj.add(10, 20);

    }

}
