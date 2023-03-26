public class InnnerClass1<T> {

   private  class InnerClass<V> {
         V printer( V a) {
            return a;
        }

    }

   
    public static void main(String[] args) {

        InnnerClass1<String> innnerClass1 = new InnnerClass1<String>();
        InnnerClass1<String>.InnerClass<String> innerClass1 = innnerClass1.new InnerClass<String>();
        System.out.println(innerClass1.printer("Hello World"));
       
        
    }

}
