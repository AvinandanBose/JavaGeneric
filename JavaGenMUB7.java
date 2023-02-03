public class JavaGenMUB7<T extends Number & Comparable<T>> {
    T value;
    
    public JavaGenMUB7(T value) {
        this.value = value;
    }
    	
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }

    public int compareTo(JavaGenMUB7<T> other) {
        return this.value.compareTo(other.value);
    }


    
    public static void main(String[] args) {
        JavaGenMUB7<Integer> obj = new JavaGenMUB7<Integer>(10);
        System.out.println(obj.getValue());
        obj.setValue(12);
        System.out.println(obj.getValue());
        JavaGenMUB7<Integer> obj2 = new JavaGenMUB7<Integer>(11);
        System.out.println(obj.compareTo(obj2));
        System.out.println(obj.compareTo(new JavaGenMUB7<Integer>(12)));
    }

}
    

