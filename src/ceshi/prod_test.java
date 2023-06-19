package ceshi;

import java.util.LinkedList;

public class prod_test {

    public static void main(String[] args) {
        prod_test prodTest = new prod_test();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    prodTest.prod();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    prodTest.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    private final LinkedList<Integer> buffer = new LinkedList<>();

    private final Integer capacity = 10;

    /**
     * 生产者
     */
    private void prod() throws InterruptedException {
        int index = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity){
                    System.out.println("生产者满了");
                    wait();
                }

                System.out.println("生产 = " + index);
                buffer.add(index++);

                notify();

                Thread.sleep(2000);
            }
        }
    }

    private void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.size() == 0){
                    System.out.println("消费者空了");
                    wait();
                }

                Integer first = buffer.removeFirst();
                System.out.println("消费 = " + first);

                notify();

                Thread.sleep(20);
            }
        }
    }

}
