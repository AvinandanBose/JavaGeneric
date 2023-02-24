import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.Scanner;
import java.util.Set;



public class javaGenericsMap6<T,V> {
    HashMap<T, V> map = new HashMap<>();


    public void put(HashMap<T,V>map,T t, V v) {
        this.map = map;
        map.put(t, v);
        System.out.println(map);

        //Clone the map
        HashMap<T, V> map2 = (HashMap<T, V>) map.clone();

        //Contains Key
        System.out.println(map2.containsKey(1));

        //Contains Value
        System.out.println(map2.containsValue("2"));

        //forEach
        map2.forEach((key, value) -> System.out.println(key + " : " + value));

        //Get
        System.out.println(map2.get(1));

        

        //GetOrDefault
        System.out.println(map2.getOrDefault(1, v));

        //IsEmpty
        System.out.println(map2.isEmpty());

        //KeySet
        System.out.println(map2.keySet());

        //PUTALL
        map2.putAll(map);
        System.out.println(map2);

        // Remove(key: Key)
        map2.remove(1);
        System.out.println(map2);

        // Remove(key: Key, value: Value)
        map2.remove(1, "2");

        // Replace(key: Key, value: Value)
        map2.replace(t, v);

        // Replace(key: Key, oldValue: Value, newValue: Value)
        map2.replace(t, v, v);

       // ReplaceAll(BiFunction function)
        map2.replaceAll((key, value) -> value);

        //Size()
        System.out.println(map2.size());

        //Values()
        Collection<V> values = map2.values();
        System.out.println(values);

        //EntrySet()
        Set<Map.Entry<T,V>> entryset = map2.entrySet();
        System.out.println(entryset);

        // putIfAbsent()
        map2.putIfAbsent(t, v);

        //compute(key:Key,BiFunction function)
        map2.compute(t, (key, value) -> value);

        //computeIfAbsent(key:Key,Function function)                                    

        map2.computeIfAbsent(t, (key) -> v);

        //computeIfPresent(key:Key,BiFunction function)
        map2.computeIfPresent(t, (key, value) -> value);

        //merge(key:Key,value:Value,BiFunction function)
        map2.merge(t, v, (value1, value2) -> value1);


        //clear()
        map2.clear();
        System.out.println(map2);
        





        
        

    }


    public static void main(String[] args) {
        javaGenericsMap6<Integer, String> javamap = new javaGenericsMap6<>();

        HashMap<Integer, String> map = new HashMap<>();

        javamap.put(map, 1, "2");
        javamap.put(map, 3, "4");
        javamap.put(map, 5, "6");
        javamap.put(map, 7, "8");
        javamap.put(map, 9, "10");
        javamap.put(map, 11, "12");
        javamap.put(map, 13, "14");
        javamap.put(map, 15, "16");
        javamap.put(map, 17, "18");
        javamap.put(map, 19, "20");
        javamap.put(map, 21, "22");


        
        

    }
        
}                                       

    

