interface MyNumber<T> //Functional interface
{
    double getValue();
}

public class LambdaGenerics2<T extends MyNumber<Number>>{

    T num;

    public LambdaGenerics2(T num) {
        this.num = num;
    }

    MyNumber<T> view = () -> num.getValue();

    public static void main(String[] args) {
        LambdaGenerics2<MyNumber<Number>> myNum = new LambdaGenerics2<>(()-> 12.33);
        System.out.println(myNum.view.getValue());
    }
    
}
