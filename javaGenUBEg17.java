public class javaGenUBEg17<T extends Float> {
    T value;
    public javaGenUBEg17(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        Float f = new Float(10.06f);
        javaGenUBEg17<Float> obj = new javaGenUBEg17<>(f);
        //javaGenUBEg17<Float> obj = new javaGenUBEg17<>(new Float(10.06f));
        // javaGenUBEg17<Float> obj = new javaGenUBEg17<>(10.06f);
        System.out.println(obj.getValue());
        obj.value = new Float(20.08f);
        System.out.println(obj.getValue());
        System.out.println(obj.value);
        obj.value = obj.value + 30.07f;
        System.out.println(obj.getValue());
        System.out.println(obj.value);
        obj.value = obj.value * 40.088f;
        System.out.println(obj.getValue());
        System.out.println(obj.value);
    }
    
}
