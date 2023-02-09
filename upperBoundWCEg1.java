import java.util.List;
import java.util.ArrayList;

class A  {
}
public class upperBoundWCEg1<T extends List<? extends ArrayList<A>>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        upperBoundWCEg1<ArrayList<ArrayList<A>>> obj = new upperBoundWCEg1<>();
        obj.add(10, 20);

    }

}