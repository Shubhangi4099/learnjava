import java.io.Console;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ReadingConsole {
    public static void main(String... args) {
        Console console = System.console();

        if (console == null) {
            System.err.println("No console found.");
            return;
        } else {
            console.writer().print("Hello there! (reply to salute)\n");
            console.flush();

            String hello = console.readLine();
            console.printf("You replied with: '" + hello + "'\n");

            Calendar calendar = new GregorianCalendar();
            console.format("Today is: %1$tm %1$te, %1$tY\n", calendar);

        }
    }
}