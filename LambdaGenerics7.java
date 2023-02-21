interface SubLamda<T> // Functional interface
{
    int sub(int a, int b);
}

interface SubLamda2<T> // Functional interface
{
    int sub2(int a, int b);
}

class SubLamdaImpl<T> implements SubLamda<T>, SubLamda2<T> {

    @Override
    public int sub2(int a, int b) {
        return a - b;
    }

    @Override
    public int sub(int a, int b) {
       return a - b;
    }

    

}

public class LambdaGenerics7<T extends SubLamda<? super Number > & SubLamda2<? super Number>> {


    SubLamda<T> sub  = (a, b)-> {
        int result = a - b;
        return result;
    };
    
    SubLamda2<T> sub2 = (a,b)-> {
        int result = a - b;
        return result;
    };

    public static void main(String[] args) {
        
        LambdaGenerics7<SubLamdaImpl<Number>> myNum = new LambdaGenerics7<>();
        System.out.println(myNum.sub.sub(12, 13));
        System.out.println(myNum.sub2.sub2(17, 19));
        
    }


    
    
}
