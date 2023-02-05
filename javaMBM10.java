import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class javaMBM10<T extends Number & Serializable> {
    
    String path;
  
    public  <T extends Number & Serializable> T serialize(T name) {
       
        try {
            File f = new File(path);
            FileOutputStream file = new FileOutputStream(f);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(name);
            System.out.println("Object has been successfully serialized... ");
            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public  <T extends Number & Serializable> T deserialize() {
        try {
            File f = new File(path);
            FileInputStream file = new FileInputStream(f);
            ObjectInputStream in = new ObjectInputStream(file);
            T name1 = (T) in.readObject();
            System.out.println("name1 = " + name1);
            System.out.println("Object has been successfully deserialized... ");
            in.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        javaMBM10<Integer> j = new javaMBM10<>();
        j.path = "C:\\Users\\bosea\\temp.txt";
        j.serialize(100);
        j.deserialize();
    }
    
}
