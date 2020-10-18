import java.io.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Ryan Ali";
        e.address = "Ajanta, Ekta Nagar";
        e.SSN = 123;
        e.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(e);
            out.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
