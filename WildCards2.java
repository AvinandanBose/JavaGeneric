interface A {

}

interface B<T> {

}


class Example<T> implements  B<T> {

}



public class WildCards2 <T extends Example<? extends B<? extends A>>>  {
    
        public void add(int a, int b) {
            System.out.println(a + b);
        }
    
        public static void main(String[] args) {
    
            WildCards2<Example<B<A>>> obj = new WildCards2<>();
            obj.add(10, 20);
    
        }
    
}
