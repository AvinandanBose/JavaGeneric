class Gen<T> {
    T obj;

    Gen(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }

}

public class GenHierarchy3<V> extends Gen<V> {

    GenHierarchy3(V o) {
        super(o);
        
    }

    public static void main(String args[]) {
        GenHierarchy3<String> x = new GenHierarchy3<String>("Generics Test");
        System.out.println(x.getObj());
    }
    
}
