
interface A {

}

class Example<T> implements A {

}

public class WildCards<T extends Example<? extends A>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        WildCards<Example<A>> obj = new WildCards<>();
        obj.add(10, 20);

    }

}
