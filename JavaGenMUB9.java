public class JavaGenMUB9<T  extends Thread & Runnable> {
    public void run(T t) {
        System.out.println("Runnable");
        t.run();

    }
    
    public static void main(String[] args) {
        JavaGenMUB9<Thread> obj = new JavaGenMUB9<>();
        obj.run(new Thread());
        
    }
  
}