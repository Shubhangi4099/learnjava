public class HumanDemo {
    public static void main(String... args) {
        var john = new Human();
        john.name = "John";
        john.age = 30;

        System.out.println("John's age = " + john.age);
        System.out.println("Human's lifespan = " + Human.LIFESPAN);
    }
}
