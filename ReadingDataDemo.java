import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class ReadingDataDemo {
    public static final String EXIT = "exit";
    public static final String HELP = "help";
    public static final String BYTE = "byte";
    public static final String SHORT = "short";
    public static final String INT = "int";
    public static final String BOOLEAN = "bool";
    public static final String DOUBLE = "double";
    public static final String LINE = "line";
    public static final String BIGINT = "bigint";
    public static final String TEXT = "text";

    public static void main(String... args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String help = getHelpString();
        System.out.println(help);

        String input;

        do {
            System.out.println("Enter option: ");
            input = sc.nextLine();

            switch (input) {
            case HELP:
            System.out.println(help);
            break;
            case EXIT:
            System.out.println("Hope you had fun. Buh-bye!");
            break;
            case BYTE:
            byte b = sc.nextByte();
            System.out.println("Nice byte there: " + b);
            sc.nextLine();
            break;
            case SHORT:
            short s = sc.nextShort();
            System.out.println("Nice short there: " + s);
            sc.nextLine();
            break;
            case INT:
            int i = sc.nextInt();
            System.out.println("Nice int there: " + i);
            sc.nextLine();
            break;
            case BOOLEAN:
            boolean bool = sc.nextBoolean();
            System.out.println("Nice boolean there: " + bool);
            sc.nextLine();
            break;
            case DOUBLE:
            double d = sc.nextDouble();
            System.out.println("Nice double there: "+ d);
            sc.nextLine();
            break;
            case LINE:
            String line = sc.nextLine();
            System.out.println("Nice line of text there: " + line);
            break;
            case BIGINT:
            BigInteger bi = sc.nextBigInteger();
            System.out.println("Nice big integer there: " + bi);
            sc.nextLine();
            break;
            case TEXT:
            String text = sc.next();
            System.out.println("Nice text there: " + text);
            sc.nextLine();
            break;
            default:
                System.out.println("No idea what you want bruh!");
            }
        } while (!input.equalsIgnoreCase(EXIT));
    }

    private static String getHelpString() {
        return new StringBuilder("This application helps you test various usage of Scanner. Enter type to be read next: ")
            .append("\n\thelp > display this help")
            .append("\n\texit >  leave the application")
            .append("\n\tbyte > read a byte")
            .append("\n\tshort > read a short")
            .append("\n\tint > read an int")
            .append("\n\tbool > read a boolean")
            .append("\n\tdouble > read a double")
            .append("\n\tline > read a line of text")
            .append("\n\tbigint > read a BigInteger")
            .append("\n\ttext > read a text value").toString();
    }
}
