public class javaMBM16<T extends Object & Comparable<T>> {

    public  <T extends Object & Comparable<T>> void test(T t, T t1) {

        System.out.println(t.compareTo(t1));
    }
    public static void main(String[] args) {
        javaMBM16<Integer> mbm16 = new javaMBM16<Integer>();
        mbm16.test(1, 2);
        mbm16.test(1.0, 1.0);
        mbm16.test("a", "b");
        
       
    }
    
}
