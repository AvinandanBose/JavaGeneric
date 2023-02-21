interface DivLamda<T> // Functional interface
{
    double div(double a, double b);
}

interface DivLamda2<T> // Functional interface
{
    double div(double a, double b);
}



public class LambdaGenerics8<T extends DivLamda<? super Number> & DivLamda2<? super Number>> {

    DivLamda<T> div = (a, b) -> {
        double result = a / b;
        return result;
    };

    DivLamda2<T> div2 = (a, b) -> {
        double result = a / b;
        return result;
    };

    public static void main(String[] args) {

        LambdaGenerics8<?> myNum = new LambdaGenerics8<>();
        System.out.println(myNum.div.div(12, 13));
        System.out.println(myNum.div2.div(17, 19));

    }
    
}
