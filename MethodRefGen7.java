interface MethodRefAdd11<T> {
    int add(int a, int b);
}
public class MethodRefGen7<T extends MethodRefAdd11<Number>> {

    static int add(MethodRefAdd11<Number> mysum4, int a, int b) {
        System.out.println("A val=" + a + " " + "B val=" + b + " " + (a + b));
        return mysum4.add(a, b);

    }

    public static void main(String[] args) {
        MethodRefAdd11<Number> mysum4 = (a,b)-> a+b;
        int res = add(mysum4, 12, 13);
        System.out.println(res);

        System.out.println(mysum4.add(12, 13));
    }                                   
    
}
