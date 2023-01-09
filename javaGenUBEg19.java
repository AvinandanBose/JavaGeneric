public class javaGenUBEg19<T extends Short> {
    T value;
    public javaGenUBEg19(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        javaGenUBEg19<Short> obj = new javaGenUBEg19<>(new Short((short)25));
        System.out.println(obj.getValue());
        obj.value = (short) 26;
        System.out.println(obj.getValue());
        System.out.println(obj.value);
    }
    
}
