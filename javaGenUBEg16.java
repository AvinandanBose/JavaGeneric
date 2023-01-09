public class javaGenUBEg16<T extends Integer> {
    T value;
    public javaGenUBEg16(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        Integer i = new Integer(10);
        javaGenUBEg16<Integer> obj = new javaGenUBEg16<>(i);
        //javaGenUBEg16<Integer> obj = new javaGenUBEg16<>(new Integer(10));
        // javaGenUBEg16<Integer> obj = new javaGenUBEg16<>(10);
        System.out.println(obj.getValue());
        obj.value = new Integer(20);
        System.out.println(obj.getValue());
        System.out.println(obj.value);
        obj.value = obj.value + 30;
        System.out.println(obj.getValue());
        System.out.println(obj.value);
        obj.value = obj.value * 40;
        System.out.println(obj.getValue());
        System.out.println(obj.value);
    }
    
}
