interface ConstGen3<T> {
}

interface ConstGen4<T> {
}

class ImplGen<T> implements ConstGen3<T>, ConstGen4<T> {
}

interface ConstGen5<T extends ConstGen3<? super Number> & ConstGen4<? super Number>> {
    MyFuncGen2<T> add(int a, int b);
}

interface ConstGen6<T extends ConstGen3< Number> & ConstGen4<Number>> {
    MyFuncGen3<T> add(T a, int num);
}

class MyFuncGen2<T extends ConstGen3<? super Number> & ConstGen4<? super Number>> {
    public MyFuncGen2(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
    }
}

class MyFuncGen3<T extends ConstGen3<? super Number> & ConstGen4<? super Number>> {
    public MyFuncGen3(T a, int num) {
        System.out.println("num = " + num);
    }
}

public class ConstructorRefGen7 {

    public static void main(String[] args) {
        ConstGen5<ImplGen<Number>> ref = MyFuncGen2::new;
        ref.add(10, 20);

        ConstGen6<ImplGen<Number>> ref1 = MyFuncGen3::new;

        ref1.add(new ImplGen<Number>(), 10);
        ImplGen<Number> impl = new ImplGen<Number>();
        ref1.add(impl, 20);                                 
    }
    
}
