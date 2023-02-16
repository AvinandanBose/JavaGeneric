class NonGen {
    int num;
    NonGen(int i) {
        num = i;
    }
    int getNum() {
        return num;
    }
}

class Gen<T> extends NonGen {
    T ob;
    Gen(T o, int i) {
        super(i);
        ob = o;
    }
    T getOb() {
        return ob;
    }
}


 class HierDemo {
    public static void main(String args[]) {
        Gen<String> x = new Gen<String>("Generics Test", 88);
        System.out.println(x.getNum());
        System.out.println(x.getOb());
    }
    
}
