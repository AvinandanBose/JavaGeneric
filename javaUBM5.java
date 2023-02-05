import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class javaUBM5 {

    static String path;
    static String name;

    public static <T extends Serializable> void serialize() {
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

    }

    public static <T extends Serializable> T deserialize(T ret) {
        try {
            File f = new File(path);
            FileInputStream file = new FileInputStream(f);
            ObjectInputStream in = new ObjectInputStream(file);
            T name1 = (T) in.readObject();// Automatically T = String extends Serializable interface
            // Also we can write "String name = (String) in.readObject();
            System.out.println("name1 = " + name1);
            System.out.println("Object has been successfully deserialized... ");
            in.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ret;

    }

    public static void main(String[] args) {
        path = "C:\\Users\\bosea\\myfile.ser";
        name = "MY Name is Java";
        serialize();
        String f =deserialize("Finished .....");
        System.out.println(f);
    }

}