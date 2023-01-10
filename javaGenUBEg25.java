abstract class Example3{
    abstract  int add(int i, int j);
    double substract(double i, double j) {
        return j - i;
    }

}

public class javaGenUBEg25<T extends Example3> {
    T value;
    public javaGenUBEg25(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {

        Example3 example = new Example3() {
            @Override
            int add(int i, int j) {
                return i + j;
            }
        };
        javaGenUBEg25<Example3> obj = new javaGenUBEg25<>(example);
        System.out.println(obj.value.add(10, 20));
        System.out.println(obj.value.substract(10.5, 20.5));
    }
    
}
