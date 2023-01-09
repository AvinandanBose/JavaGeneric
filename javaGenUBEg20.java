public class javaGenUBEg20<T extends Long> {
    T value;
    public javaGenUBEg20(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        javaGenUBEg20<Long> obj = new javaGenUBEg20<>(new Long(2500009L));
        System.out.println(obj.getValue());
        obj.value = 26L;
        System.out.println(obj.getValue());
        System.out.println(obj.value);
    }
    
}
