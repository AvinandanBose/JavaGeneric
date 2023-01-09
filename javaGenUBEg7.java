public class javaGenUBEg7<T extends Runnable> {
    public void run(T t) {
        t.run();
    
    }

    
    public static void main(String[] args) {
        javaGenUBEg7<Thread> obj = new javaGenUBEg7<>();
        obj.run(new Thread());
    }
    
}
