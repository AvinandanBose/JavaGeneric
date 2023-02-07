interface A {

}

interface B<T extends A> {

}

interface C<T extends A> {

}

class D<T extends A> implements B<A>, C<A> {
}

public class WildCards5 <T extends B<? extends A> & C<? extends A>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        WildCards5<D<A>> obj = new WildCards5<>();
        obj.add(10, 20);

    }
    
}
