public class InnnerClass6<T > {

    <T extends CharSequence> T test(T t) {
        int num = 23;
        class MethodInner<V> {
            public void print() {
                System.out.println("This is method inner class " + num);
            }
        }

        MethodInner<String> inner = new MethodInner<String>();
        inner.print();

        return t;
    }

    public static void main(String[] args) {
        InnnerClass6<String> outer = new InnnerClass6<String>();
        outer.test("My Method");
    }
    
}
