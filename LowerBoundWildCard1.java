import java.util.List;
import java.util.AbstractList;
import java.util.ArrayList;

interface B {

}
public class LowerBoundWildCard1<T extends List<? super ArrayList<B>>> {
    
        public void add(int a, int b) {
            System.out.println(a + b);
        }
    
        public static void main(String[] args) {
    
            LowerBoundWildCard1<ArrayList<ArrayList<B>>> obj = new LowerBoundWildCard1<>();
            LowerBoundWildCard1<ArrayList<Object>> obj1 = new LowerBoundWildCard1<>();
            LowerBoundWildCard1<ArrayList<AbstractList<B>>> obj2 = new LowerBoundWildCard1<>();
    
            obj.add(10, 20);
            obj1.add(10, 20);
            obj2.add(10, 20);
    
        }


    
}
