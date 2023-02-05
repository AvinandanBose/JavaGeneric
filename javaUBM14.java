public class javaUBM14<T extends Runnable> //Generic Class

{
    
     public<T extends Runnable> void test(T t) //Generic Method
     {
         System.out.println(t);
         t.run();
     }

        public static void main(String[] args) {
            javaUBM14<Thread> obj = new javaUBM14<>();
            obj.test(new Thread());
        }
}
