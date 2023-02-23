import java.util.List;
import java.util.ArrayList;

interface ImplGen<T extends List<? super Number>> {
   CImplGen<T> add(int a, int b);
}

class CImplGen<T extends List<? super Number>> {
    public CImplGen(int a, int b) {
        System.out.println("a = " + a + " " + "b = " + b);
    }
}
public class ConstructorRefGen8 {

      public static void main(String[] args) {
         ImplGen<ArrayList<Number>> ref = CImplGen::new;
         ref.add(10, 20);
      }
    
}
