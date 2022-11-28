public class java_generics34 {

    public static <T> void view(T a, T b) {
       System.out.println("a: " + a);
       System.out.println("b: " + b);
    }
    
    public static <S> void view(S a, S b, S c) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    public static void main(String[] args) {
        view(1, 2);
        view("One", "Two", "Three");
    }
    
}
