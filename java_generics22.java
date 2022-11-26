public class java_generics22<T> {
    T[] data;
    int a;
    int b;

    java_generics22(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void view(T[] item) {

       for (int i = 0; i <= item.length-1; i++) {
          System.out.println("The value is: " + item[i]);
           
       }
        
    }



    public static void main(String[] args) {
        java_generics22<Integer> p1;
        p1 = new java_generics22<>(1, 2);

        p1.data = new Integer[2];

        p1.data[0]= p1.a;
        p1.data[1]= p1.b;
        p1.view(p1.data);
    }
}

      
 
    
