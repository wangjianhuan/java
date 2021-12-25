package lianxi;


import java.util.LinkedList;
import java.util.Queue;

/*
 *
 *@Author:IntelliJ IDEA
 *@Time:2020/12/6:19:50
 *
 */
public class Test {
    public static void main(String[] args) {
        Ceshi_Xiancheng ceshi = new Ceshi_Xiancheng();
        Thread t1 = new Thread(ceshi,"王一");
        Thread t2 = new Thread(ceshi,"王二");
        Thread t3 = new Thread(ceshi,"王三");
        Thread t4 = new Thread(ceshi,"王四");
        Thread t5 = new Thread(ceshi,"王五");
        Thread t6 = new Thread(ceshi,"王六");

        Queue<Thread> queue = new LinkedList<>();
        queue.offer(t1);
        queue.offer(t2);
        queue.offer(t3);
        queue.offer(t4);
        queue.offer(t5);
        queue.offer(t6);
        while (!queue.isEmpty()){
            queue.poll().start();
        }
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
    }

}
