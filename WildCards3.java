
interface A {

}

interface B<T extends A> {

}

class Example<T> implements B<A> {

}
public class WildCards3 <T extends Example<? extends B<? extends A>>>{

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        WildCards3<Example<B<A>>> obj = new WildCards3<>();
        obj.add(10, 20);

    }
    
}
