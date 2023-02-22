//objRef::methodName - Method Reference

interface MethodRefAdd10<T> {
    int add(int a, int b);
}

class MethodRefAddGen10<T> {
     int addition(int a, int b) //object cannot access static method
     {
        return a + b;
    }
}

public class MethodRefGen6 <T extends MethodRefAdd10<Number>>{

    
    static int Add(MethodRefAdd10<Number> a, int b, int c) {
        return a.add(b, c);
    }

    public static void main(String[] args) {
        MethodRefAddGen10<Number> a = new MethodRefAddGen10<Number>();
        MethodRefAdd10<Number> b = a::addition;
        int res = b.add(12, 13);
        System.out.println(res);

        System.out.println(Add(a::addition, 12, 13));

        
    }
    
}
