public class InnnerClass5<T> {

     T my_Method(T item){

        int num = 23;

        class MethodInner<V> {
            public void print() {
                System.out.println("This is method inner class "+num);       
            }
        } 

        MethodInner<String> inner = new MethodInner<String>();
        inner.print();

        return item;
    }

    public static void main(String[] args) {
        InnnerClass5<String> outer = new InnnerClass5<String>();
        System.out.println(outer.my_Method("My Method"));  
    }
    
}
