import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

interface ImplGen<T extends List<Object>> {
   CImplGen<T> add(int a, int b);
}

interface ImplGen1<T extends List<Serializable>> {
   CImplGen<T> add(int a, int b);
}

interface ImplGen2<T extends List<Number>> {
   CImplGen<T> add(int a, int b);
}

class CImplGen<T extends List<? super Number>> {
    public CImplGen(int a, int b) {
        System.out.println("a = " + a + " " + "b = " + b);
    }
}
public class ConstructorRefGen8 {

      public static void main(String[] args) {
         ImplGen<ArrayList<Object>> ref = CImplGen::new;
         ref.add(10, 20);

         ImplGen1<ArrayList<Serializable>> ref1 = CImplGen::new;
         ref1.add(10, 20);

         ImplGen2<ArrayList<Number>> ref2 = CImplGen::new;
         ref2.add(10, 20);
      }


    
}
