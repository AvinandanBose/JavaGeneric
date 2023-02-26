
interface A<T> {
    public T get(T a);
}

interface B<T> {
    public T get(T b);
}

class C<T> implements A<T>, B<T> {
    public T get(T c) {
        return c;
    }
}

class Example6<T extends A<? extends Number> & B<? extends Number>>{
    public static void main(String[] args) {
        A<Number> a = new A<Number>(){
            @Override
            public Number get(Number a) {
                return a;
            }
        };

        System.out.println(a.get(1));

        B<Integer> b = new B<Integer>(){
            @Override
            public Integer get(Integer b) {
                return b;
            }
        };

        System.out.println(b.get(2));

        
    }

    // Same for Double, Float,
    // Long, Short, Byte,
    // Which are extended by Number
     



}