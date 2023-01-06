public class javaGenUBEg3<T extends Number> {
      private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    void add(T a, T b) {
        System.out.println(a.intValue() + b.intValue());
        System.out.println(a.doubleValue() + b.doubleValue());
        System.out.println(a.floatValue() + b.floatValue());

    }
        
        public static void main(String[] args) {
            javaGenUBEg3<Integer> obj = new javaGenUBEg3<Integer>();
            obj.set(10);
            System.out.println(obj.get());
            javaGenUBEg3<Double> obj1 = new javaGenUBEg3<Double>();
            obj1.set(10.5);
            System.out.println(obj1.get());
            javaGenUBEg3<Float> obj2 = new javaGenUBEg3<Float>();
            obj2.set(10.5f);
            System.out.println(obj2.get());
            javaGenUBEg3<Long> obj3 = new javaGenUBEg3<Long>();
            obj3.set(10l);
            System.out.println(obj3.get());
            javaGenUBEg3<Short> obj4 = new javaGenUBEg3<Short>();
            obj4.set((short)10);
            System.out.println(obj4.get());
            javaGenUBEg3<Byte> obj5 = new javaGenUBEg3<Byte>();
            obj5.set((byte)10);
            System.out.println(obj5.get());

            obj.add(10, 20);
            obj1.add(10.5, 20.6);
            obj2.add(10.5f, 20.6f);
            obj3.add(10l, 20l);
            obj4.add((short)10, (short)20);
            obj5.add((byte)10, (byte)20);
        }
}
  
