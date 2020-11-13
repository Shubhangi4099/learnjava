import java.io.IOException;

public class Reading {
    public static void main(String... args) throws IOException {
        System.out.println("Press any key to terminate...");
        int read = System.in.read();
        System.out.println("Key pressed: " + read);
    }
}
