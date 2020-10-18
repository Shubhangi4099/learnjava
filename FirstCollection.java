import java.util.ArrayList;

public class FirstCollection {
    public static void main(String[] args) {
        var arrayList = new ArrayList<String>();

        arrayList.add("hello");
        arrayList.add(", ");
        arrayList.add("readers");
        arrayList.add("!");

        for (var i : arrayList) {
            System.out.print(i);
        }
        System.out.println();

    }
}

