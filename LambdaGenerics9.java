interface func<T> {
    int add(int a, int b);
}

public class LambdaGenerics9<T extends func<Number>> {
    static int Add(func<Number> a, int b, int c) {
        return a.add(b, c);
    }

    public static void main(String[] args) {
        int res = Add((a, b) -> a + b, 12, 13);
        System.out.println(res);
    }
    
}
