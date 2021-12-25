package lianxi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 *@Author:IntelliJ IDEA
 *@Time:2020/11/5:13:03
 *
 */

public class 猫狗队列 {
    static class myqueue {
        private Queue<String> queueall;
        private Queue<String> queuecat;
        private Queue<String> queuedog;

        public myqueue() {
            queueall = new LinkedList<>();
            queuecat = new LinkedList<>();
            queuedog = new LinkedList<>();
        }

        public void add(String s1, String s2) {
            String s = s1 + s2;
            queueall.offer(s);
            if (s1.equals("cat")) {
                queuecat.offer(s);
            } else if (s2.equals("dag")) {
                queuedog.offer(s);
            }
        }

        public void pollAll(){
            while (!queueall.isEmpty()){
                System.out.println(queueall.poll());
            }
            while (!queuecat.isEmpty()){
                queuecat.poll();
            }
            while (!queuedog.isEmpty()){
                queuedog.poll();
            }
        }

        public void isEmpty(){
            if (queueall.isEmpty())
                System.out.println("yes");
            else
                System.out.println("no");
        }

        public void isDogEmpty(){
            if (queuedog.isEmpty())
                System.out.println("yes");
            else
                System.out.println("no");
        }

        public void isCatEmpty(){
            if (queuecat.isEmpty())
                System.out.println("yes");
            else
                System.out.println("no");
        }

        public void pollDog(){
            while (!queuedog.isEmpty()){
                System.out.println(queuedog.poll());
            }
            queueall = queuecat;
        }

        public void pollCat(){
            while (!queuecat.isEmpty()){
                System.out.println(queuecat.poll());
            }
            queueall = queuedog;
        }
    }

    public static void main(String[] args) {
        myqueue myqueue = new myqueue();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] strings = line.split(" ");
            if (strings[0].equals("add")) {
                myqueue.add(strings[1], strings[2]);
            }else if (strings[0].equals("pollAll")){
                myqueue.pollAll();
            }else if (strings[0].equals("isEmpty")){
                myqueue.isEmpty();
            }else if (strings[0].equals("isDogEmpty")){
                myqueue.isDogEmpty();
            }else if (strings[0].equals("isCatEmpty")){
                myqueue.isCatEmpty();
            }else if (strings[0].equals("pollDog")){
                myqueue.pollDog();
            }else if (strings[0].equals("pollcat")){
                myqueue.pollCat();
            }
        }
    }
}
