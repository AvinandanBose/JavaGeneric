// Erasure of Methods

class GenericBase {

    public <T> T get(T t) {
        return t;
    }

    public static void main(String[] args) {
        GenericBase gb = new GenericBase();
        System.out.println(gb.get(10));
        System.out.println(gb.get("Hello"));
        System.out.println(gb.get(10.0));

    }

}
