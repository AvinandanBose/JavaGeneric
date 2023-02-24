import java.util.HashMap;

public class javaGenericsMap5<T,V> {

    HashMap<T,V> map = new HashMap<>();
    String[] Name = new String[10];
    String[] RollNo = new String[10];

    javaGenericsMap5(HashMap<T,V> map, String[] RollNo, String[] Name) {
        this.map = map;
        this.RollNo = RollNo;
        this.Name = Name;

        for (int i = 0; i < 10; i++) {
            map.put( (T) Name[i], (V) RollNo[i] );
        }

        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        String[] RollNo= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] Name= {"Avi", "Basak", "Cena", "Daniels", "Emma", "Fathom", "Ginny", "Harry", "I", "J"};
        javaGenericsMap5<String, String> javamap = new javaGenericsMap5<>(map, RollNo, Name);
    }

    
}
