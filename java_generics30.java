class A<T> {
    

    T obj(T a, T b) {
        
        return a;
    }

    T obj(T a, T b, T c) {
        return b;
    }
    

    public static void main(String[] args) {
        A<Integer> a = new A<Integer>();
        System.out.println(a.obj(1, 2));
        System.out.println(a.obj(20, 30, 40));
    }
}