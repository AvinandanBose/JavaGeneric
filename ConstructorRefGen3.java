import java.util.ArrayList;
import java.util.List;

interface ConstRef2<T extends List<? extends Number> > {
    MyFunc2<T> func(T a);
}

class MyFunc2<T extends List<? extends Number> > {
    public MyFunc2(T a) {
        System.out.println("a = " + a );
    }

   
}

//Interface <Type> must be = class MyFunc2<Type>
public class ConstructorRefGen3 {
    public static void main(String[] args) {
        ConstRef2<List<Integer>> ref = MyFunc2::new;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ref.func(list);
        MyFunc2<List<Integer>> myFunc2 = ref.func(List.of(1,2,3));
     

       
    }
    
}
