interface B<T> {

}

class C<T> implements B<A> {

}

public class WildCards7 <T extends C<? extends A>> {
    
        public void add(int a, int b) {
            System.out.println(a + b);
        }
    
        public static void main(String[] args) {
    
            WildCards7<C<A>> obj = new WildCards7<>();
            obj.add(10, 20);
    
        }
    
}
