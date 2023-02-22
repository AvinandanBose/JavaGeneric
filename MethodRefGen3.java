interface MethodRefAdd2<T> {
    int add(int a, int b);
}

interface MethodRefAdd3<T> {
    int add(int a, int b);
}

class MethodRefAddGen3<T>  {

    
   static int add(int a, int b) {
       return a + b;
    }
   
}

public class MethodRefGen3<T extends MethodRefAdd2<Number> & MethodRefAdd3<Number>> {
    
        static int add(int a, int b) {
            return a + b;
        }
    
        static int Add(MethodRefAdd2<Number> a, int b, int c) {
            return a.add(b, c);
        }
    
        public static void main(String[] args) {
            MethodRefAdd2<Number> a = Integer::sum;
            int res = a.add(12, 13);
            System.out.println(res);

            MethodRefAdd2<Number> a1 = MethodRefAddGen3::add;
            int res1 = a1.add(12, 13);
            System.out.println(res1);
   
            Integer sum = Add(Integer::sum, 12, 13);
            System.out.println(sum);
            
            
            Integer sum2 = Add(MethodRefGen3::add, 12, 13);
            System.out.println(sum2);

            Integer sum3 = Add(MethodRefAddGen3::add, 12, 13);
            System.out.println(sum3);
        }

        
    
}
