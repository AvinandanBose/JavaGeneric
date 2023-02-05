import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class javaUBM13<T extends Serializable> {
     T path;
     T name; 
        public javaUBM13(T path) {
            this.path = path;
        }

      public <T extends Serializable> T serialize() {
            try {
                File f = new File((String) path);
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

        public <T extends Serializable> T deserialize(T ret) {
            try {
                File f = new File((String) path);
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
            return ret;
        }

        public static void main(String[] args) {
            javaUBM13<String> obj = new javaUBM13<String>("C:\\Users\\bosea\\temp.txt");
            obj.name = "My Name";
            obj.serialize();
            obj.deserialize("Hello World");
        }
    
}
