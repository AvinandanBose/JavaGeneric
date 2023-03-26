public class InnnerClass2 <T extends Number>{
    private  class InnerClass<V extends CharSequence> {
         V printer( V a) {
            return a;
        }

    }

   
    public static void main(String[] args) {

        InnnerClass2<Integer> innnerClass1 = new InnnerClass2<>();
        InnnerClass2<Integer>.InnerClass<String> innerClass1 = innnerClass1.new InnerClass<>();
        System.out.println(innerClass1.printer("Hello World"));
       
        

    }
    
}
