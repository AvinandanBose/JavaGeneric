

class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

public static void main(String[] args) {
        Node<String> n1 = new Node<String>("Hello");
        Node<String> n2 = new Node<String>("World");
        n1.next = n2;
        System.out.println(n1.data);
        System.out.println(n1.next.data);
    }

}