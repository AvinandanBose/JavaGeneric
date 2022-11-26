public class java_generics23<T> {
    T[] data;
    int a;
    int b;

    java_generics23(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap(T[] item) {
       for (int i = 0; i <= item.length-1; i++) {
              T temp = item[i];
              item[i] = item[item.length-1];
              item[item.length-1] = temp;
                
          }
           
       }

       public void print() {
              for (int i = 0; i <= data.length-1; i++) {
                System.out.println(data[i]);
              }
         }

    public static void main(String[] args) {
        java_generics23<Integer> p1;
        p1 = new java_generics23<>(1, 2);

        p1.data = new Integer[2];

        p1.data[0]= p1.a;
        p1.data[1]= p1.b;
        p1.swap(p1.data);
        p1.print();
        }
    }
        
    


