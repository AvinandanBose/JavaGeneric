class Gen3<T>{
    T obj;
    Gen3(T o){
        obj = o;
    }
    T getObj(){
        return obj;
    }
}

class Gen4<T> extends Gen3<T>{
    Gen4(T o){
        super(o);
    }
}

class HierDemo{


    public static void main(String args[]){
        Gen3<Integer> iOb = new Gen3<Integer>(88);
        Gen4<Integer> iOb2 = new Gen4<Integer>(99);
        Gen4<String> strOb2 = new Gen4<String>("Generics Test");

        if(iOb2 instanceof Gen4<Integer>){
            System.out.println("iOb2 is instance of Gen4");
        }

        if (iOb2 instanceof Gen3<Integer>) {
            System.out.println("iOb2 is instance of Gen3");
        }


        if(strOb2 instanceof Gen4<String>){
            System.out.println("iOb2 is instance of Gen4");
        }

        if (strOb2 instanceof Gen3<String>) {
            System.out.println("iOb2 is instance of Gen3");
        }

        if (iOb instanceof Gen3<Integer>) {
            System.out.println("iOb2 is instance of Gen3");
        }

        if (iOb instanceof Gen4<Integer>) {
            System.out.println("iOb2 is instance of Gen3");
        }
    }
}