
import java.util.ArrayList;
public class Example1<T extends Exception> {
    public  T get(ArrayList<T> t) throws T {
        return t.get(0);
    }

    public static void main(String[] args) {
        Example1<Exception> e = new Example1<>();
        ArrayList<Exception> al = new ArrayList<>();
        al.add(new Exception("Exception Thrown"));
        try {
            System.out.println(e.get(al));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
