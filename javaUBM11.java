public class javaUBM11 {
    public static <T extends Object> T getValue(T t) {
        return t;
    }
    public static void main(String[] args) {
        Integer i = getValue(10);
        String s = getValue("Hello");
        Byte b = getValue((byte) 10);
        Character c = getValue('a');
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        System.out.println(c);
    }
}
  
