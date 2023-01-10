interface Example2 {
    public void addI(int a, int  b);
    default void addD(double a, double b) {
        System.out.println(a + " + " + b + "=" + (a + b));
    }
}

public class javaGenUBEg24<T extends Example2> {
    T value;
    public javaGenUBEg24(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {

        Example2 example = new Example2() {
            @Override
            public void addI(int a, int b) {
                System.out.println(a + " + " + b + "=" + (a + b));
            }
        };
        javaGenUBEg24<Example2> obj = new javaGenUBEg24<>(example);
        obj.value.addI(10, 20);
        obj.value.addD(10.5, 20.5);
    }
    
}
