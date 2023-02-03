import java.util.ArrayList;
import java.util.List;

public class JavaGenMUB11 <T extends ArrayList<String> &List<String> >{
    T list;
    
    public JavaGenMUB11(T list) {
        this.list = list;
    }
    
    public void add(String t) {
        list.add(t);
    }
    
    public String get(int index) {
        return list.get(index);
    }
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        JavaGenMUB11<ArrayList<String>> obj = new JavaGenMUB11<>(list);
        System.out.println(obj.list);
        obj.add("six");
        System.out.println(obj.list);
        System.out.println(obj.get(5));
        
    }
    
}
