interface ConstRef1<T> {
    MyFunc<T> func(int a, int b);
}

class MyFunc<T> {
    public MyFunc(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
    }
}

public class ConstructorRefGen1 {
    public static void main(String[] args) {
        ConstRef1<Integer> ref = MyFunc::new;
        ref.func(10, 20);
    }
    
}
