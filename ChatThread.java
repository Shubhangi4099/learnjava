class T1 implements Runnable {
    Chat m;
    String[] s1 = {"Hi", "How are you?", "I am also doing fine!"};

    public T1(Chat m1) {
        this.m = m1;
        new Thread(this, "Question1").start();
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.Question(s1[i]);
        }
    }
}

class T2 implements Runnable {
    Chat m;
    String[] s2 = {"Hi", "I am good, what about you?", "Great!"};

    public T2(Chat m2) {
        this.m = m2;
        new Thread(this, "Answer1").start();
    }

    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.Answer(s2[i]);
        }
    }
}

public class ChatThread {
    public static void main(String[] args) {
        Chat m = new Chat();
        new T1(m);
        new T2(m);
    }
}
