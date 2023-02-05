public class javaMBM3 {

    public static <T extends Thread & Runnable> void test(T t) {

        System.out.println("Runnable");
        t.run();
        t.start();
        System.out.println("Thread has been started...");
        synchronized (t) {
            try {
                t.wait(1000);

            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted...");
            }

            t.notify();
            System.out.println("Thread has been notified...");
        

        }

    }

    public static void main(String[] args) {
        test(new Thread());
        
        
    }
    
}
