interface MyNumber<T> // Functional interface
{
    double getValue();
}
public class LambdaGenerics3<T extends MyNumber<Number>> {

    MyNumber<T> view = () -> 12.33;

    public static void main(String[] args) {
        LambdaGenerics3<MyNumber<Number>> myNum = new LambdaGenerics3<>();
        System.out.println(myNum.view.getValue());
    }
    
}
