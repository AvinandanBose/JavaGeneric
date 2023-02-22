interface MethodRefAdd4<T> {
    int add(int a, int b);
}

interface MethodRefAdd5<T> {
    int add(int a, int b);
}

class MethodRefAddGen4<T> {

    static int add(int a, int b) {
        return a + b;
    }

}

public class MethodRefGen4<T extends MethodRefAdd4<? extends Number> & MethodRefAdd5<? extends Number>> {

    static int add(int a, int b) {
        return a + b;
    }

    static int Add(MethodRefAdd4<Number> a, int b, int c) {
        return a.add(b, c);
    }

    public static void main(String[] args) {
        MethodRefAdd4<Integer> a = MethodRefAddGen4::add;
        int res = a.add(12, 13);
        System.out.println(res);

        Integer sum = Add(MethodRefAddGen4::add, 12, 13);
        System.out.println(sum);

        

        

        
    }
    
}
