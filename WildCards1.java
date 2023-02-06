interface A {

}

interface B {
}

class Example<T> implements A,B {

}


public class WildCards1 <T extends Example<? extends A > & B> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        WildCards1<Example<A>> obj = new WildCards1<>();
        obj.add(10, 20);

    }
    
}
