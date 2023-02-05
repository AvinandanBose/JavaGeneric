public class javaUBM18<T extends CharSequence> {
    public  <T extends CharSequence> void append(T value) {
        System.out.println(value);

    }
    public static void main(String[] args) {
        javaUBM18<String> ubm18 = new javaUBM18<String>();
        ubm18.append("Avinandan");
        ubm18.append(new String("Bose"));
        ubm18.append(new StringBuilder("Avinandan Bose"));
    }
}
