class Gen9<T> {
    T ob;

    Gen9(T o) {
        ob = o;
    }

    T getob() {
        System.out.print("Gen9's getob(): ");
        return ob;
    }
}

class Gen10<T> extends Gen9<T> {
    Gen10(T o) {
        super(o);
    }

    // Override getob()
    T getob() {
        System.out.print("Gen10's getob(): ");
        return ob;
    }
}

class OverrideDemo {
    public static void main(String args[]) {
        Gen9<Integer> iOb = new Gen9<Integer>(88);
        Gen10<Integer> iOb2 = new Gen10<Integer>(99);
        Gen10<String> strOb2 = new Gen10<String>("Generics Test");

        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}