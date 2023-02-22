interface MethodRefAdd1<T> {
    int add(int a, int b);
}

public class MethodRefGen2 <T extends MethodRefAdd1<Number>>{

    static int add(int a, int b) {
        return a + b;
    }
    
    static int Add(MethodRefAdd1<Number> a, int b, int c) {
        return a.add(b, c);
    }

    public static void main(String[] args) {
        MethodRefAdd1<Number> a = Integer::sum;
        int res = a.add(12, 13);
        System.out.println(res);

        Integer sum = Add(Integer::sum, 12, 13);
        System.out.println(sum);

        Integer sum2 = Add(MethodRefGen2::add, 12, 13);
        System.out.println(sum2);
    }

    
    
}
