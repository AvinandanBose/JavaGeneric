interface Example1 {
    public void addI(int a, int b);
}

class InterfaceUBb implements Example1 {
    @Override
    public void addI(int a, int b) {
        System.out.println(a + " + " + b + "=" + (a + b));
    }

}

public class javaGenUBEg23<T extends Example1> {
    T value;

    public javaGenUBEg23(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        javaGenUBEg23<InterfaceUBb> obj = new javaGenUBEg23<>(new InterfaceUBb());
        obj.value.addI(10, 20);
        InterfaceUBb obj1 = new InterfaceUBb();
        obj1.addI(80, 40);
        javaGenUBEg23<InterfaceUBb> obj2 = new javaGenUBEg23<>(obj1);
        obj2.value.addI(50, 60);
    }
}
