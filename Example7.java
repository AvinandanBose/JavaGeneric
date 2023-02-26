import java.io.Serializable;

interface A1<T> {
    public T get(T a);
}

interface B1<T> {
    public T get(T b);
}

class C1<T> implements A1<T>, B1<T> {
    public T get(T c) {
        return c;
    }
}


public class Example7<T extends A1<? super Number> & B1<? super Number>> {

    public static void main(String[] args) {
        A1<Number> a = new A1<Number>(){
            @Override
            public Number get(Number a) {
                return a;
            }
        };

        System.out.println(a.get(1));

        B1<Object> b = new B1<Object>(){
            @Override
            public Object get(Object b) {
                return b;
            }
        };

        System.out.println(b.get(2));


        B1<Serializable> b2 = new B1<Serializable>() {
            @Override
            public Serializable get(Serializable b) {
                return b;
            }
        };

        System.out.println(b2.get(3));

    }
    
    
    
}
