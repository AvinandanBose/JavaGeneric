

abstract class A<T>{
    abstract T show();
}   
//Anonymous Inner Class
public class InnnerClass9 {

    public static void main(String[] args) {
        A<String> a = new A<String>(){
            String show(){
                return "Hello World";
            }
        };
        System.out.println(a.show());
    }
    
}
