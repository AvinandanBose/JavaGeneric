

class Example<T > {
    T ob;
    T vals[];
    Example(T o, T[] nums) {
        ob = o;
        vals = nums;
        System.out.println("o = " + o);
        for (T x : nums) {
            System.out.print(x + " ");
        }
        for (int i=0; i<nums.length; i++){
            System.out.print("nums=" + nums[i] + " ");
        }

    }
    public void print(){
        System.out.println("Example");
    }

    public static void main(String[]args){
        Integer n[] = {1,2,3,4,5};
        String s[] = {"one", "two", "three", "four", "five"};
        Double d[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Example<Integer> iob = new Example<Integer>(50, n);
        Example<?>[] e = new Example<?>[10];
        e[0] = new Example<String>("50", s);
        e[1] = new Example<Integer>(50, n);
        e[2] = new Example<Double>(50.99, d);
        e[0].print();
        e[1].print();
        e[2].print();

    }

}


