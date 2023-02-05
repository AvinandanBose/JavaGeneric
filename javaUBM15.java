public class javaUBM15<T extends Thread> {
    public  <T extends Thread> void run(T t) {
        t.start();
        System.out.println("Thread has been started...");

    }
    
    public  <T extends Thread> void wait(T t) {
        synchronized (t) {
            try {
                t.wait(1000);

            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted...");
            }

        }

    }

    public  <T extends Thread> void notify(T t) {
        synchronized (t) {
            t.notify();
        }
    }

    public static void main(String[] args) {
        javaUBM15<Thread> obj = new javaUBM15<>();
        obj.run(new Thread());
        System.out.println("My name ....");
        obj.wait(new Thread());
        System.out.println("Avinandan Bose");
        obj.notify(new Thread());
        System.out.println("Thread has been notified...");
    }
}
