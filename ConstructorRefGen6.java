
interface ConstGen1<T>{}
interface ConstGen2<T> {}

class ImplGen<T> implements ConstGen1<T>, ConstGen2<T> {}

interface ConstGen3<T extends ConstGen1<? extends Number> & ConstGen2<? extends Number>> {
    MyFuncGen<T> add(int a, int b);
}

interface ConstGen4<T extends ConstGen1< Integer> & ConstGen2< Integer>> {
    MyFuncGen1<T> add(T a, int num);
}

class MyFuncGen<T extends ConstGen1<? extends Number> & ConstGen2<? extends Number>> {
    public MyFuncGen(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
    }
}

class MyFuncGen1<T extends ConstGen1<? extends Number> & ConstGen2<? extends Number>> {
    public MyFuncGen1(T a, int num) {
        System.out.println( "num = " + num);
    }
}

public class ConstructorRefGen6 {

    public static void main(String[] args) {
        ConstGen3<ImplGen<Number>> ref = MyFuncGen::new;
        ref.add(10, 20);

        ConstGen4<ImplGen<Integer>> ref1 = MyFuncGen1::new;

        
        ref1.add(new ImplGen<Integer>(), 10);
        ImplGen<Integer> impl = new ImplGen<>();
        ref1.add(impl, 20);
    }
    
}




