class java_generics4<A, B> {
    Object first;
    Object second;

    java_generics4(Object a, Object b) {
        first = a;
        second = b;
    }

    Object getFirst() {
        return first;
    }

    Object getSecond() {
        return second;
    }

    public static void main(String[] args) {
        java_generics4<Integer, String> p1;
        p1 = new java_generics4<Integer, String>(1, "apple"); // Generic Type

        java_generics4<String, Double> p2;
        p2 = new java_generics4<String, Double>("orange", 2.3); // Generic Type

        int price = (int) p1.getFirst();
        System.out.println(price);

        String fruit = (String) p1.getSecond();
        System.out.println(fruit);

        String fruit2 = (String) p2.getFirst();
        System.out.println(fruit2);

        double price2 = (double) p2.getSecond();
        System.out.println(price2);
    }
}
