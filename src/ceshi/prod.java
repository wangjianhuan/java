package ceshi;

import java.util.LinkedList;

public class prod {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    // 缓冲区已满，生产者等待
                    wait();
                }

                System.out.println("生产者生产: " + value);
                buffer.add(value++);

                // 唤醒等待中的消费者线程
                notify();

                // 线程休眠，模拟生产过程
//                Thread.sleep(100);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.size() == 0) {
                    // 缓冲区为空，消费者等待
                    wait();
                }

                int value = buffer.removeFirst();
                System.out.println("消费者消费: " + value);

                // 唤醒等待中的生产者线程
                notify();

                // 线程休眠，模拟消费过程
                Thread.sleep(1000);
            }
        }
    }

    public static void main(String[] args) {
        final prod example = new prod();

        // 创建生产者线程
        Thread producerThread = new Thread(() -> {
            try {
                example.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 创建消费者线程
        Thread consumerThread = new Thread(() -> {
            try {
                example.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 启动线程
        producerThread.start();
        consumerThread.start();
    }
}
