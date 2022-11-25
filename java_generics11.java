public class java_generics11<A, B> {
    A[] data;
    B[] data2;

    public static void main(String[] args) {
        java_generics11<Integer, String> p1;
        p1 = new java_generics11<Integer, String>();
        p1.data = new Integer[2];
        p1.data[0] = 1;
        p1.data[1] = 2;

        for (Integer i : p1.data) {
            System.out.println(i);

        }

        p1.data2 = new String[2];
        p1.data2[0] = "apple";
        p1.data2[1] = "pear";
        for (String i : p1.data2) {
            System.out.println(i);
        }
    }

}
