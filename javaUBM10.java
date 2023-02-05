public class javaUBM10 {

    public static <T extends CharSequence> void append(T value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        append("Avinandan");
        append(new String("Bose"));
        append(new StringBuilder("Avinandan Bose"));
    }
  
}
