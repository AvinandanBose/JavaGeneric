import java.util.HashSet;
import java.util.Set;

public class JavaGenMUB12<T extends HashSet<String> & Set<String>> {
    T set;

    public JavaGenMUB12(T set) {
        this.set = set;
    }

    public void add(String string) {
        set.add(string);
    }

    public boolean contains(String string) {
        return set.contains(string);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        JavaGenMUB12<HashSet<String>> obj = new JavaGenMUB12<>(set);
        System.out.println(obj.set);
        obj.add("six");
        System.out.println(obj.set);
        System.out.println(obj.contains("six"));
    }
    
}
