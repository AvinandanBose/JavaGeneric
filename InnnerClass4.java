public class InnnerClass4<T> {

    void my_Method(){

        int num = 23;

        class MethodInner<V> {
            public void print() {
                System.out.println("This is method inner class "+num);       
            }
        } 

        MethodInner<String> inner = new MethodInner<String>();
        inner.print();
    }

    public static void main(String[] args) {
        InnnerClass4<String> outer = new InnnerClass4<String>();
        outer.my_Method();  
    }
    
}
