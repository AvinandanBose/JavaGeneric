public class java_generics26 {

    public static <T> void reverse(T[]data){
        int low = 0, high = data.length - 1;
        while (low < high) {
            T temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            low++;
            high--;
            
        }
    }

   
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5};
        String[] b = {"one", "two", "three", "four", "five"};
        reverse(a);
        reverse(b);

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i <= b.length - 1; i++) {
            System.out.println(b[i]);
        }
      
    }
}
