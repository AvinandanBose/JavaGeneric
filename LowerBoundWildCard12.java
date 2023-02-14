import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCard12 {
    public static void main(String[] args) {
        List<? super Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
    
}
