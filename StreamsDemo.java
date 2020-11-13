import java.util.Arrays;

public class StreamsDemo {
    public static void main(String... args) {
        int[] arr = { 50, 10, 20, 250, 200 };
        
        Arrays.stream(arr, 2, 5).forEach(i -> 
            System.out.println(Thread.currentThread().getName() + ": " + i)
        );
    }
}
