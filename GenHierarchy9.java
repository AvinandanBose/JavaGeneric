class MyClass<T, V> {
    T ob1;
    V ob2;

    MyClass(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    boolean isEqual(MyClass<T, V> o) {
        if (ob1 == o.ob1 && ob2 == o.ob2) {
            return true;
        } else {
            return false;
        }

       

    }
    
    public static void main(String[] args) {

        MyClass<Integer, String> a = new MyClass<Integer, String>(100, "Generics");

        if (a.isEqual(new MyClass<Integer, String>(100, "Generics"))) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}