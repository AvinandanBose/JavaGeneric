public class ObjectPair {
    Object first ;
    Object second ;
    public ObjectPair(Object a, Object b) //Constructor
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
        ObjectPair p1 = new ObjectPair(1, "apple");
        ObjectPair p2 = new ObjectPair(2, "pear");
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());
    }

}
