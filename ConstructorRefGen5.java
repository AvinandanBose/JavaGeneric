import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

interface ConstRef5<T extends AbstractList<Number>&List<Number>> {
    MyFunc5<T> add(int a, int b);
}

interface ConstRef6<T extends AbstractList<Number> & List<Number>> {
    MyFunc6<T> add(T a);
}

class MyFunc5<T extends AbstractList<Number> & List<Number>> {

    public MyFunc5(int a, int b) {
        System.out.println("a = " + a + " " + "b = " + b);

    }

}

class MyFunc6<T extends AbstractList<Number> & List<Number>> {

    public MyFunc6(T a) {
        System.out.println("a = " + a);

    }

}

public class ConstructorRefGen5 {

    public static void main(String[] args) {

        ConstRef5<ArrayList<Number>> ref = MyFunc5::new;
        ref.add(10, 20);

        ConstRef6<ArrayList<Number>> ref2 = MyFunc6::new;
        ArrayList<Number> list = new ArrayList<>();
        list.add(1.02f);
        list.add(2.02009);
        list.add(3);
        
        ref2.add( list);

    }
    
}
