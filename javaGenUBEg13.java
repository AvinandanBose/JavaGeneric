public class javaGenUBEg13<T extends CharSequence> {
    T value;
    public javaGenUBEg13(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        CharSequence cs = "Avinandan";
        javaGenUBEg13<CharSequence> obj = new javaGenUBEg13<>(cs);
        // javaGenUBEg13<CharSequence> obj = new javaGenUBEg13<>(new String("Avinandan"));
        // javaGenUBEg13<CharSequence> obj = new javaGenUBEg13<>("Avinandan");
        System.out.println(obj.getValue());
        obj.value = "Bose";
        System.out.println(obj.getValue());
        System.out.println(obj.value);
        System.out.println(obj.getValue());
    }
    
}
