public class java_generics21 {
    public static <T>void printElem (T data){
        System.out.println("The value is: " + data);
    }

    public static <T> Integer printElem2(T data) {
       return (Integer)data;
    }

    public static void main(String[] args) {
        printElem("Hello");
        printElem(10);
        printElem(10.5);
        printElem(true);
        System.out.println("The value is: " + printElem2(10));
    }
}

 
