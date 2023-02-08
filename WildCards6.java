
interface A{

}
interface B<T>{

}


public class WildCards6 <T extends B<? extends A>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        WildCards6<B<A>> obj = new WildCards6<>();
        obj.add(10, 20);

    }


    
}
