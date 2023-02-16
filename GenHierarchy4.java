class Gen<T> {
    T obj;

    Gen(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }

}

 public class GenHierarchy4<V,T> extends Gen<T> {
    V ob2;

    GenHierarchy4(T o, V o2) {
        super(o);
        ob2 = o2;
        
    }

    V getOb2() {
        return ob2;
    }

    public static void main(String args[]) {
        GenHierarchy4<Integer, String> x = new GenHierarchy4<>("Generics Test", 88);
        System.out.println(x.getObj());
        System.out.println(x.getOb2());
    }
    
}
