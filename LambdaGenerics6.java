interface AddLamda<T> // Functional interface
{
    int add(int a, int b);
}

interface AddLamda2<T> // Functional interface
{
    int add2(int a, int b);
}

class AddLamdaImpl<T> implements AddLamda<T>, AddLamda2<T> {

    @Override
    public int add2(int a, int b) {
        return a + b;
    }

    @Override
    public int add(int a, int b) {
       return a + b;
    }

   

   

}

public class LambdaGenerics6<T extends AddLamda<? extends Number> & AddLamda2<? extends Number>> {
   

    AddLamda<T> view = (a, b) -> {
        int result = a + b;
        return result;
        
    };

    AddLamda2<T> view2 = (a, b) -> {
        int result = a + b;
        return result;

    };
  

    public static void main(String[] args) {
        
        
        LambdaGenerics6<AddLamdaImpl<Number>> myNum = new LambdaGenerics6<>();
        System.out.println(myNum.view.add(12, 13));
        System.out.println(myNum.view2.add2(17, 19));
        
        
    }
    
}
