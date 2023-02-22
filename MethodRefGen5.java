interface MethodRefAdd6<T> {
    int add(int a, int b);
}

interface MethodRefAdd7<T> {
    int add(int a, int b);
}

class MethodRefAddGen5<T> {

    static int add(int a, int b) {
        return a + b;
    }

}



public class MethodRefGen5<T extends MethodRefAdd6<? super Number> & MethodRefAdd7<? super Number>> {

    static int add(int a, int b) {
        return a + b;
    }

    static int Add(MethodRefAdd6<Integer> a, int b, int c) {
        return a.add(b, c);
    }

    public static void main(String[] args) {
        MethodRefAdd6<Integer> a = MethodRefAddGen5::add;
        int res = a.add(12, 13);
        System.out.println(res);

        MethodRefAdd6<Integer> a1 = Integer::sum;
        int res1 = a1.add(12, 13);
        System.out.println(res1);

        Integer sum = Add(Integer::sum, 12, 13);
        System.out.println(sum);

        Integer sum2 = Add(MethodRefGen5::add, 12, 13);
        System.out.println(sum2);

        Integer sum3 = Add(MethodRefAddGen5::add, 12, 13);
        System.out.println(sum3);

        MethodRefAdd7<Integer> a2 = Integer::sum;
        int res2 = a2.add(12, 13);
        System.out.println(res2);
    }

    

}
