//Generics and Arrays.


public class java_generics5<A,B> {

    A first;
    B second;

    java_generics5(A a, B b) {
        first = a;
        second = b;
    }

    A getFirst() {
        return first;
    }

    B getSecond() {
        return second;
    }


    public static void main(String[] args) {
        
        java_generics5<Integer, String>[] holdings;

        holdings = new java_generics5[2];

        holdings[0] = new java_generics5<>(1, "apple");

        holdings[1] = new java_generics5<>(2, "pear");

        for (int holding =0 ; holding < holdings.length; holding++)  {
            System.out.println(holdings[holding].getFirst());
            System.out.println(holdings[holding].getSecond());
        } 
        
        
    }
    
    
}
