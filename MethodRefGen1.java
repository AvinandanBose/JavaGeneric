interface MethodRefAdd<T> {
    int add(int a, int b);
}

class MethodRefAddGen<T> {
    static int add(int a, int b) {
        return a + b;
    }
}

public class MethodRefGen1 {
    static int Add(MethodRefAdd<Number> a, int b, int c) {
        return a.add(b, c);
    }

    public static void main(String[] args) {
        MethodRefAdd<Number> a = Integer::sum;
        int res = a.add(12, 13);
        System.out.println(res);

        Integer sum = Add(Integer::sum, 12, 13);
        System.out.println(sum);

        Integer sum2 = Add(MethodRefAddGen::add, 12, 13);
        System.out.println(sum2);
    }
}
    

