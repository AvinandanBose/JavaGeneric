public class java_generics37 {

    public static <T,S> int add(T a, S b) {
        int a1 = (int) a;
        int b1 = (int) b;
        return (a1 + b1);

    }

    public static <T,S> int add(T a, S b, T c) {
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
