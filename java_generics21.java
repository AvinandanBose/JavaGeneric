public class java_generics21 {
    public static <T>void printElem (T data){
        System.out.println("The value is: " + data);
    }

    public static void main(String[] args) {
        printElem("Hello");
        printElem(10);
        printElem(10.5);
        printElem(true);
    }
}

 
