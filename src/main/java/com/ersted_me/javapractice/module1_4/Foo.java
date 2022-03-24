package main.java.com.ersted_me.javapractice.module1_4;

import java.util.concurrent.Semaphore;

public class Foo {
    Semaphore sem = new Semaphore(0);
    Semaphore sem2 = new Semaphore(0);
    Semaphore sem3 = new Semaphore(1);

    public void first(Runnable r) throws InterruptedException {
        sem3.acquire();
        r.run();
        sem.release();
    }

    public void second(Runnable r) throws InterruptedException {
        sem.acquire();
        r.run();
        sem2.release();
    }

    public void third(Runnable r) throws InterruptedException {
        sem2.acquire();
        r.run();
        System.out.println();
        sem3.release();
    }

}
