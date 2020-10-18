import java.lang.*;

class SingletonType {
    private static SingletonType s = new SingletonType();
    private SingletonType() {}

    public static SingletonType getInstance() {
        return s;
    }

    protected static void demoMethod() {
        System.out.println("DemoMethod for Singleton");
    }
}

public class Singleton {
    public static void main(String[] args) {
        SingletonType temp = SingletonType.getInstance();
        temp.demoMethod();
    }
}

