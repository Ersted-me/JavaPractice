package main.java.com.ersted_me.javapractice.module1_4;

public class RunnableImpl implements Runnable {
    private String string;

    public RunnableImpl(String string) {
        this.string = string;
    }

    @Override
    public void run() {
        System.out.print(this.string);
    }
}
