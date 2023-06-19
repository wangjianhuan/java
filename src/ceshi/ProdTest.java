package ceshi;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class ProdTest {

    private final LinkedList<Integer> list = new LinkedList<>();

    private final ReentrantLock lock = new ReentrantLock();

    int capacity = 10;

    private void prod() {
        int num = 0;
        for (; ; ) {
            synchronized (this) {
                try {
                    if (list.size() >= capacity) {
                        wait();
                    }
                    System.out.println("生产 = " + num);
                    list.add(num++);

                    notifyAll();

                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException("生产者睡眠失败!");
                }
            }
        }
    }

    private void consume() {
        for (; ; ) {
            synchronized (this) {
                try {
                    lock.lock();

                    if (list.size() <= 0) {
                        wait();
                    }
                    Integer integer = list.removeFirst();
                    System.out.println("消费 = " + integer);

                    notifyAll();

                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException("消费者线程睡眠失败!");
                }
            }
        }
    }

    public static void main(String[] args) {
        ProdTest test = new ProdTest();
        new Thread(() -> {
            test.prod();
        }).start();
        new Thread(() -> {
            test.consume();
        }).start();
    }
}
