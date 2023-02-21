interface MyNumber<T> // Functional interface
{
    double getValue();
}

public class LambdaGenerics1 {
    public static void main(String[] args) {
        MyNumber<Double> myNum = () -> 123.45;
        System.out.println(myNum.getValue());
    }

    
}
