class Gen<T> {
    T obj;

    Gen(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }
}

class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
}

// Casting a generic type
 class GenHierarchy7 {
    

    public static void main(String args[]) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);
        Gen2<String> strOb2 = new Gen2<String>("Generics Test");

        ((Gen<Integer>) iOb2 ).obj = 100; //Legal
        ((Gen<String>) strOb2).obj = "Generics Test 2";// Legal
        ((Gen<Integer>) iOb).obj = 1000;// Legal
        System.out.println(iOb2.getObj());
        System.out.println(strOb2.getObj());
        System.out.println(iOb.getObj());

        //((Gen<Long>) iOb2).obj = 101; Illegal

        

    }
}
