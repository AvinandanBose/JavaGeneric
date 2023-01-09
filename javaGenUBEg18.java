public class javaGenUBEg18<T extends Character> {
    T value;
    public javaGenUBEg18(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        javaGenUBEg18<Character> obj = new javaGenUBEg18<>(new Character('A'));
        System.out.println(obj.getValue());
        obj.value = 'B';
        System.out.println(obj.getValue());
        System.out.println(obj.value);
        
    }
    
}
