import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class JavaGenMUB8<T extends Number & Serializable> {
    T path;
    T name;

    public JavaGenMUB8(T path) {
        this.path = path;
    }

    public T serialize(T name) {
        this.name = name;
        try {
            File f = new File(path.toString());
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

    public T deserialize() {
        try {
            File f = new File(path.toString());
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

        JavaGenMUB8<Integer> obj = new JavaGenMUB8<>(10);
        obj.serialize(100);
        obj.deserialize();

    }

}
