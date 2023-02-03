
public class JavaGenMUB14<T extends Object & Comparable<T>> {
    T value;
    
    public JavaGenMUB14(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public int compareTo(JavaGenMUB14<T> other) {
        return value.compareTo(other.value);
    }
    
    public static void main(String[] args) {
        JavaGenMUB14<String> obj = new JavaGenMUB14<String>("Hello");
        System.out.println(obj.getValue());
        obj.setValue("World");
        System.out.println(obj.getValue());
        JavaGenMUB14<String> obj2 = new JavaGenMUB14<String>("Hello");
        System.out.println(obj.compareTo(obj2));
        System.out.println(obj.compareTo(new JavaGenMUB14<String>("World")));
    }
    
}
