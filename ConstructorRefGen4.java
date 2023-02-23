import java.util.List;

interface ConstRef3<T extends List<? extends Number>> {
    MyFunc3<T> add(int a, int b);
}

interface ConstRef4<T extends List<? extends Number>> {
    MyFunc4<T> add(T a);
}

class MyFunc3<T extends List<? extends Number>> {

         public MyFunc3 (int a, int b) {
            System.out.println("a = " + a + " " + "b = " + b);
         
        }
   
}

class MyFunc4<T extends List<? extends Number>> {

    public MyFunc4 (T a) {
            System.out.println("a = " + a );
         
        }

}




public class ConstructorRefGen4 {

    public static void main(String[] args) {
        
        ConstRef3<List< Number>> ref = MyFunc3::new;
        ref.add(10, 20);
        
        ConstRef4<List<Integer>> ref2 = MyFunc4::new;
        List<Integer> list = List.of(1,2,3,4);
        ref2.add(list);

    }
    
}
