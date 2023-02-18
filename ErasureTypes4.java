//BridgeMethods

class Gener<T>{
    T obj;
    Gener(T o){
        obj = o;
    }
    T getObj(){
        return obj;
    }
}

class Gener2 extends Gener<String>{
    Gener2(String  o){
        super(o);
    }

    String getObj(){
        System.out.println("Gener2's getObj()");
        return obj;
    }
}

class BridgeDemo {

    public static void main(String args[]){
        Gener2 strOb2 = new Gener2("Generics Test");

        String str = strOb2.getObj();

        System.out.println(str);
    }

}
