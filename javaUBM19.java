public class javaUBM19 <T extends Object>{
    public  <T extends Object> T getValue(T t) {
        return t;
    }
    public static void main(String[] args) {
        javaUBM19<Object> obj = new javaUBM19<>();
        Integer i = obj.getValue(10);
        String s = obj.getValue("Hello");
        Byte b = obj.getValue((byte) 10);
        Character c = obj.getValue('a');
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        System.out.println(c);
    }
    
}
