import java.util.List;

public class ListDemo {
    public static void main(String... args) {
        List<String> items = List.of("1", "a", "b", "c", "2", "3");

        items.forEach(item -> {
            if (item.equals("a")) {
                System.out.println("A");
            } else {
                System.out.println("Not A");
            }
        });
    }
}
