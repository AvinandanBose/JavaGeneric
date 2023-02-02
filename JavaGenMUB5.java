
interface A {
    public int add(int i, int j);
}

interface B {
    public int add(int i, int j, int k);
}

abstract class C {

    public int sub(int i, int j) {
        return j-i;
    }
}

class D extends C implements A,B{
    @Override
    public int add(int i, int j) {
        return i + j;
    }
    
    @Override
    public int add(int i, int j,int k) {
        return i + j+k;
    }
}
public class JavaGenMUB5<T extends  C& A&B> {
    public int mul(int i, int j) {
        return i * j;
    }

    public int mul(int i, int j, int k) {
        return i * j * k;
    }

    public static void main(String[] args) {
        JavaGenMUB5<D> obj = new JavaGenMUB5<>();
        System.out.println(obj.mul(2, 3));
        System.out.println(obj.mul(2, 3, 4));
          
    }
    
}
