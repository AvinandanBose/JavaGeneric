public class javaGenUBEg2<T extends Number> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        javaGenUBEg2<Integer> obj = new javaGenUBEg2<Integer>();
        obj.set(10);
        System.out.println(obj.get());
    }

}
