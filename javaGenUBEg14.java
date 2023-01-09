public class javaGenUBEg14<T extends StringBuffer> {
    T value;
    public javaGenUBEg14(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Avinandan");
        javaGenUBEg14<StringBuffer> obj = new javaGenUBEg14<>(sb);
        // javaGenUBEg14<StringBuffer> obj = new javaGenUBEg14<>(new StringBuffer("Avinandan"));
        System.out.println(obj.getValue());
        obj.value = new StringBuffer("Bose");
        System.out.println(obj.getValue());
        System.out.println(obj.value);
    }
    
}
