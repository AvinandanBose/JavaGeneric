interface A {

}

interface B<T > {

}

interface D<T> {

}
		
class C<T> implements B<A>, D<A>{
}



public class WildCards4<T extends B<? extends A> & D<? extends A>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        WildCards4<C<A>> obj = new WildCards4<>();
        obj.add(10, 20);

    }
    
}
