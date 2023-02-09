import java.util.List;
import java.util.ArrayList;

interface B{

}
public class upperBoundWCEg2<T extends List<? extends ArrayList<B>>> {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        upperBoundWCEg2<ArrayList<ArrayList<B>>> obj = new upperBoundWCEg2<>();
        obj.add(10, 20);

    }

}
