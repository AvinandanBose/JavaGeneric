public class javaGenUBEg8<T extends Thread> {

    public void run(T t) {
        t.start();
        System.out.println("Thread has been started...");

    }

    public void wait(T t) {
        synchronized (t) {
            try {
                t.wait(1000);

            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted...");
            }

        }

    }

    public void notify(T t) {
        synchronized (t) {
            t.notify();
        }
    }



    public static void main(String[] args) throws InterruptedException {
        javaGenUBEg8<Thread> obj = new javaGenUBEg8<>();
        obj.run(new Thread());

        System.out.println("My name ....");
        obj.wait(new Thread());
        System.out.println("Avinandan Bose");
        obj.notify(new Thread());
        System.out.println("Thread has been notified...");
    }

}
