import java.util.HashSet;

public class javaGenUBEg26 <T extends HashSet<String>> {
    T set;
    
    public javaGenUBEg26(T set) {
        this.set = set;
    }
    
    public void add(String elem) {
        set.add(elem);
    }
    
    public boolean contains(String t) {
        return set.contains(t);
    }
    
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        javaGenUBEg26<HashSet<String>> obj = new javaGenUBEg26<>(set);
        System.out.println(obj.set);
        obj.add("six");
        System.out.println(obj.set);
        System.out.println(obj.contains("one"));
    }
    
}
