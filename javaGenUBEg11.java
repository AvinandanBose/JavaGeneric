public class javaGenUBEg11<T extends String> {
    T value;
    public javaGenUBEg11(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        
        javaGenUBEg11<String> obj = new javaGenUBEg11<>(new String("Avinandan"));
        System.out.println(obj.getValue());
        obj.value = "Bose";
        System.out.println(obj.getValue());
        System.out.println(obj.value);
    }
    
}
