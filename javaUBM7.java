public class javaUBM7 {

    public static<T extends Thread>void run(T t) {
        t.start();
        System.out.println("Thread has been started...");

    }

    public static <T extends Thread>void wait(T t) {
        synchronized (t) {
            try {
                t.wait(1000);

            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted...");
            }

        }

    }

    public static <T extends Thread>void notify(T t) {
        synchronized (t) {
            t.notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        run(new Thread());

        System.out.println("My name ....");
        wait(new Thread());
        System.out.println("Avinandan Bose");
        notify(new Thread());
        System.out.println("Thread has been notified...");
    }

}
