 class Node1<T> {

     T data;

     Node1(T data) {
        this.data = data;
    }

     void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

class MyNode extends Node1<Integer> {
     MyNode(Integer data) {
        super(data);
    }

     void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}

class BridgeMethods {

    public static void main(String[] args) {
        Node1<Integer> node = new MyNode(5);
        node.setData(4);
    }
}