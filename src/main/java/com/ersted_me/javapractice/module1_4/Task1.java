package main.java.com.ersted_me.javapractice.module1_4;

public class Task1 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                try {
                    foo.second(new RunnableImpl("second"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(() -> {
                try {
                    foo.third(new RunnableImpl("third"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(() -> {
                try {
                    foo.first(new RunnableImpl("first"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

        }
    }
}
