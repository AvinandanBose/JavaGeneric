class MyClass<K,S>{
    void obj(K a, K b){
        System.out.println(a);
        System.out.println(b);
    }
    void obj(S b, S a, S c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String[] args){
        MyClass<Integer, String> a = new MyClass<>();
       a.obj(1, 2);
        a.obj("One","Two","Three");
    }
}