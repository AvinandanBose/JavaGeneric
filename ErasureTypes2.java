// Erasure of Methods

class GenericBase<T> {

    private T element;

    public T get(T element) {
        this.element = element;
        return element;
    }

    public static void main(String[] args) {
        GenericBase<Integer> gb = new GenericBase<Integer>();
        System.out.println(gb.get(10));
    }

}
