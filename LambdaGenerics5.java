interface MyNumber<T> // Functional interface
{
    double getValue();
}



public class LambdaGenerics5<T extends MyNumber<? extends Number>> {

    T num;

    public LambdaGenerics5(T num) {
        this.num = num;
    }

    MyNumber<T> view = () -> num.getValue();

    public static void main(String[] args) {
        LambdaGenerics5<MyNumber<Number>> myNum = new LambdaGenerics5<>(()-> 12.33);
        System.out.println(myNum.view.getValue());

        LambdaGenerics5<MyNumber<Integer>> myNum1 = new LambdaGenerics5<>(() -> 12);
        System.out.println(myNum1.view.getValue());
    }
    
}
