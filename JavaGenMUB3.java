interface A {
    public int add(int i, int j);
}

interface B {
    public int sub(int i, int j);
}

interface C{
    public int mul(int i, int j);
}


class D implements A, B, C{

    @Override
    public int add(int i, int j) {
        return i + j;
    }

    @Override
    public int sub(int i, int j) {
        return i - j;
    }

    @Override
    public int mul(int i, int j) {
        return i * j;
    }
}
public class JavaGenMUB3 <T extends D & A &B & C> {
    public int div(int i, int j) {
        return i / j;
    }

    public int div(int i, int j, int k) {
        return i / j / k;
    }

    public static void main(String[] args) {
        JavaGenMUB3<D> obj = new JavaGenMUB3<>();
        System.out.println(obj.div(10, 5));
        System.out.println(obj.div(10, 5, 2));
    }
    
}
