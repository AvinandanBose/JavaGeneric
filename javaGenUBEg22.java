public class javaGenUBEg22<T extends Example> {
    T value;
    public javaGenUBEg22(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        javaGenUBEg22<Example> obj = new javaGenUBEg22<>(new Example(10));
        System.out.println(obj.getValue());
        obj.value.setI(20);
        System.out.println(obj.getValue());
        System.out.println(obj.value);
        System.out.println(obj.getValue());
        obj.value.addI(10, 20);
        
    }
    
}
class Example{
    int i;
    public Example(int i) {
        this.i = i;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public void addI(int a, int b) {
        System.out.println(a+b);
    }
    @Override
    public String toString() {
        return "Example [i=" + i + "]";
    }


}