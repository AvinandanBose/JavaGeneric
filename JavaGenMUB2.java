interface A {
    public int add(int i, int j);
}

interface B {
    public int sub(int i, int j);
}

class C implements A, B {
    @Override
    public int add(int i, int j) {
        return i + j;
    }

    @Override
    public int sub(int i, int j) {
        return i - j;
    }
}
public class JavaGenMUB2<T extends B & A> {
    public int mul(int i, int j) {
        return i * j;
    }

    public int mul(int i, int j, int k) {
        return i * j * k;
    }

    public static void main(String[] args) {
        JavaGenMUB1<C> obj = new JavaGenMUB1<>();
        System.out.println(obj.mul(2, 3));
        System.out.println(obj.mul(2, 3, 4));
          
    }
}
