interface MyNumber<T> // Functional interface
{
    double getValue();
}

interface MyNumber2<T> // Functional interface
{
    double getValue();
}

class MyNumberImpl<T> implements MyNumber<T>, MyNumber2<T>{

    @Override
    public double getValue() {
        return 0;
    }
    
}

public class LambdaGenerics4<T extends MyNumber< Number> & MyNumber2<Number>> {

    T num;

    public LambdaGenerics4(T num) {
        this.num = num;
    }

    MyNumber<T> view = () -> 12.55;
    MyNumber2<T> view2 = () -> 12.59;

    public static void main(String[] args) {        
        MyNumberImpl<Number> num = new MyNumberImpl<>();                      
        LambdaGenerics4<MyNumberImpl<Number>> myNum = new LambdaGenerics4<>(num);
        System.out.println(myNum.view.getValue());
        System.out.println(myNum.view2.getValue());
    }


    
}
