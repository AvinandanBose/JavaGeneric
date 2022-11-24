
class Pair<A, B> {
    A first;
    B second;

    Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    A getFirst() {
        return first;
    }

    B getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 ;
        p1 = new Pair<Integer, String>(1, "apple"); // Generic Type
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());

        Pair<Integer, String> p2 ;
        p2 = new Pair(2, "pear"); // Classic Type 
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());


        Pair<Integer, String> p3 ;
        p3 = new Pair<>(3, "orange"); // Generic Type
        System.out.println(p3.getFirst());
        System.out.println(p3.getSecond());
    }

}

