import java.io.*;

public class DeSerialize {
    public static void main(String[] args) {
        Employee e = null;

        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch(IOException ex) {
            ex.printStackTrace();
            return;
        } catch(ClassNotFoundException exx) {
            exx.printStackTrace();
            System.out.println("Employee class not found.");
            return;
        }

        System.out.println("Deserializing Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("Number: " + e.number);
        System.out.println("SNN: " + e.SSN);
    }
}

