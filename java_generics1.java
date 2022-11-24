//JavaGenerics 
//Generics are a feature of Java that allows you to create classes and methods that work with different types of data.
//Generics are a way to make your code more flexible and reusable.

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
        Pair<Integer, String> p1 = new Pair<Integer, String>(1, "apple");
        Pair<Integer, String> p2 = new Pair<Integer, String>(2, "pear");
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());
    }

}

// Java Generics