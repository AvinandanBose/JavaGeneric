//Multiple Upper Bound 


interface A {
    public int add(int i, int j);
}


class B implements A {
    @Override
   public int add(int i, int j){
         return i+j;
   }
}


public class JavaGenMUB1<T extends B & A  >  {
    public int mul(int i, int j) {
        return i * j;
    }
    public int mul(int i, int j, int k) {
        return i * j * k;
    }
    public static void main(String[] args) {
        JavaGenMUB1<B> obj = new JavaGenMUB1<>();
        System.out.println(obj.mul(10, 5));
        System.out.println(obj.mul(10, 5,14));
    }
    
    
  
    
}
