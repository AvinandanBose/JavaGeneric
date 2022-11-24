public class java_generics {
     Object first ;
    Object second ;
    public java_generics(Object a, Object b) //Constructor
    {
        first = a;
        second = b;
    }
    public Object getFirst() //Getter
    {
        return first;
    }   
    
    public Object getSecond() //Getter
    {
        return second;
    }
    public static void main(String[] args) {
        java_generics p1 = new java_generics("Banana", 3.12);
        java_generics p2 = new java_generics("Apple", 4);
        String stock = (String)p1.getFirst();
        System.out.println(stock);
        String stock2 = (String)p2.getFirst();
        System.out.println(stock2);

        Double price = (Double)p1.getSecond();
        System.out.println(price);
        Integer price2 = (Integer)p2.getSecond();
        System.out.println(price2);
    }
    
}
