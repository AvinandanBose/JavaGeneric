// Program to illustrate Heap pollution with respect to varargs

import java.util.ArrayList;
import java.util.List;

public class HeapPollution {
   
    public static void merge(List<String>... stringList) {
       
        Object[] arr = stringList;
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(420);
        arr[0] = temp;

        String firstEle = stringList[0].get(0);//ClassCastException
        System.out.println(firstEle);
        
    }

    
    public static void main(String args[]) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list1.add("My Name");
        list2.add("is");
        list3.add("Avinandan");

        merge(list1, list2, list3);
    }
}
