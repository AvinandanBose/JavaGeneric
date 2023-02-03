public class JavaGenMUB13 <T extends CharSequence & Comparable<T>> {
    T value;
    
    public JavaGenMUB13(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public int compareTo(JavaGenMUB13<T> other) {
        return value.compareTo(other.value);
    }
    
    public static void main(String[] args) {
        JavaGenMUB13<String> obj = new JavaGenMUB13<String>("Hello");
        System.out.println(obj.getValue());
        obj.setValue("World");
        System.out.println(obj.getValue());
        JavaGenMUB13<String> obj2 = new JavaGenMUB13<String>("Hello");
        System.out.println(obj.compareTo(obj2));
        System.out.println(obj.compareTo(new JavaGenMUB13<String>("World")));
    }
    
}
