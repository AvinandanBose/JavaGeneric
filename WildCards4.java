interface A {

}

interface B<T> {

}

interface C<T> {

}
		
class D<T> implements B<A>, C<A>{
}



public class WildCards4<T extends B<? extends A> & C<? extends A>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        WildCards4<D<A>> obj = new WildCards4<>();
        obj.add(10, 20);

    }
    
}
