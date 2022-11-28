public class java_generics35 {

    public static <T> Integer add(T a, T b) {
        Integer a1 = (Integer) a;
        Integer b1 = (Integer) b;
        return (a1 + b1);

    }

    public static <S> Integer add(S a, S b, S c) {
        Integer a1 = (Integer) a;
        Integer b1 = (Integer) b;
        Integer c1 = (Integer) c;
        return (a1 + b1 + c1);
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(20, 30, 40));
    }
    
}
