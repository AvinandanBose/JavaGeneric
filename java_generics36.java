public class java_generics36 {

    public static <T> int add(T a, T b) {
        int a1 = (int) a;
        int b1 = (int) b;
        return (a1 + b1);

    }

    public static <S> int add(S a, S b, S c) {
        int a1 = (int) a;
        int b1 = (int) b;
        int c1 = (int) c;
        return (a1 + b1 + c1);
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(20, 30, 40));
    }

    
}
