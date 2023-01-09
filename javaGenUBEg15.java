public class javaGenUBEg15<T extends StringBuilder> {
    T value;
    public javaGenUBEg15(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Avinandan");
        javaGenUBEg15<StringBuilder> obj = new javaGenUBEg15<>(sb);
        //javaGenUBEg15<StringBuilder> obj = new javaGenUBEg15<>(new StringBuilder("Avinandan"));
        System.out.println(obj.getValue());
        obj.value = new StringBuilder("Bose");
        System.out.println(obj.getValue());
        System.out.println(obj.value);
        obj.value.append("Shekhar");
        System.out.println(obj.getValue());
        System.out.println(obj.value);
        obj.value.insert(0, "Mr.");
        System.out.println(obj.getValue());
        System.out.println(obj.value);
    }
    
}
