package lianxi;

/*
 *
 *@Author:IntelliJ IDEA
 *@Time:2020/12/6:19:31
 *
 */
public class Ceshi_Xiancheng implements Runnable {
    static int connt = 10;
    static int num = 0;
    boolean flag = false;


    @Override
    public void run() {
            sale();
//            System.out.println(Thread.currentThread().getName()+"之前的:"+num+"剩余："+connt);

    }
    synchronized public void sale(){
        if (connt==0){
            flag=true;
            return;
        }

        connt--;
        num++;
        System.out.println(Thread.currentThread().getName()+":"+num+"剩余："+connt);
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

