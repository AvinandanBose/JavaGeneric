 class java_generics3<A, B> {
    A first;
    B second;

    java_generics3(A a, B b) {
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
        java_generics3<Integer, String> p1;
        p1 = new java_generics3<Integer, String>(1, "apple"); // Generic Type

        java_generics3<String , Double> p2;
        p2 = new java_generics3<String, Double>("orange", 2.3); // Generic Type                           

        int price = p1.getFirst();
        System.out.println(price);

        String fruit = p1.getSecond();
        System.out.println(fruit);

        String fruit2 = p2.getFirst();
        System.out.println(fruit2);

        double price2 = p2.getSecond();
        System.out.println(price2);
    }
}

  
