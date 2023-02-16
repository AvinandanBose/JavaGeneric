class Gen<T> {
    T obj;

    Gen(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }

}

public class GenHierarchy1 <T> extends Gen<T> {
    GenHierarchy1(T o) {
        super(o);
    }

    public static void main(String args[]) {
        GenHierarchy1<String> x = new GenHierarchy1<String>("Generics Test");
        System.out.println(x.getObj());
    }
    
}


