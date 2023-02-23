interface ConstRef1<T extends Number> {
    MyFunc1<T> func(int a, int b);
}

class MyFunc1<T extends Number> {
    public MyFunc1(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
    }
}

public class ConstructorRefGen2 {
    public static void main(String[] args) {
        ConstRef1<Integer> ref = MyFunc1::new;
        ref.func(10, 20);
    }
    
}
