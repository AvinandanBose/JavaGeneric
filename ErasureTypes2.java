// Erasure of Methods

class GenericBase {

    public <Integer> Integer get(Integer t) {
        return t;
    }

    public static void main(String[] args) {
        GenericBase gb = new GenericBase();
        System.out.println(gb.get(10));
    }

}
