public class java_generics7<A,B> {
    A[] data ;
    B[] data2;
    public static void main(String[] args) {
        java_generics7<Integer, String> p1;
        p1 = new java_generics7<Integer, String>();
        p1.data = new Integer[2];
        p1.data[0] = 1;
        p1.data[1] = 2;
        for (Integer i =0 ; i < p1.data.length; i++) {
            System.out.println(p1.data[i]);
        }
        p1.data2 = new String[2];
        p1.data2[0] = "apple";
        p1.data2[1] = "pear";
        for (Integer i =0 ; i < p1.data2.length; i++) {
            System.out.println(p1.data2[i]);
        }
    }
    
}
