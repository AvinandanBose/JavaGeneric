public class InnnerClass10<T> {

    static class InnerClass<V> {
        V printer(V a) {
            return a;
        }

    }

    public static void main(String[] args) {

        InnnerClass10.InnerClass<String> innerClass1 = new InnnerClass10.InnerClass<String>();
        System.out.println(innerClass1.printer("Hello World"));

    }


    
}
