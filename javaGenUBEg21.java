public class javaGenUBEg21 <T extends Object>{
    T value;
    public javaGenUBEg21(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        javaGenUBEg21<Object> obj = new javaGenUBEg21<>(10);
        System.out.println(obj.getValue());
        javaGenUBEg21<Object> obj1 = new javaGenUBEg21<>(10.98f);
        System.out.println(obj1.getValue());
        javaGenUBEg21<Object> obj2 = new javaGenUBEg21<>((short)22);
        System.out.println(obj2.getValue());
    }
    
}
