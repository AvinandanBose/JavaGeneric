//Generics and Arrays.

 class java_generics9<A, B> {

    A first;
    B second;

    java_generics9(A a, B b) {
        first = a;
        second = b;
    }

    A getFirst() {
        return first;
    }

    B getSecond() {
        return second;
    }

    public static void main(String[] args) {

        java_generics9<Integer, String>[] holdings;

        holdings = new java_generics9[2];

        holdings[0] = new java_generics9<>(1, "apple");

        holdings[1] = new java_generics9<>(2, "pear");

       for( java_generics9<Integer, String> holding : holdings) {
            System.out.println(holding.getFirst());
            System.out.println(holding.getSecond());
        }

    }

}
