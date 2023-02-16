class Gen<T> {
    T obj;

    Gen(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }

}

public class GenHierarchy2 extends Gen<String> {
    <T> GenHierarchy2(T o) {
        super((String)o);
    }

    public static void main(String args[]) {
        GenHierarchy2 x = new GenHierarchy2("Generics Test");
        System.out.println(x.getObj());
    }
    
}
