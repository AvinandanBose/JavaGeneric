public class javaGenUBEg12<T extends Byte> {
    T value;
    public javaGenUBEg12(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        javaGenUBEg12<Byte> obj = new javaGenUBEg12<>(new Byte((byte)25));
        System.out.println(obj.getValue());
        obj.value = (byte) 26;
        System.out.println(obj.getValue());
        System.out.println(obj.value);
    }

    
}


