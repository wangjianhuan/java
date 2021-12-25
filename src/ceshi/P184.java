package ceshi;

/*
 *
 *@Author:IntelliJ IDEA
 *@Time:2020/11/8:17:18
 *
 */
public class P184 {
    public static void main(String[] args) {
        String str = "中A";
        byte[] b ="s".getBytes();
        new P184().A(str,2);
    }

    public void A(String str, int i) {
        byte b[] = new byte[1024];
        int num = 0;
        b = str.getBytes();
        System.out.println(b);
        if (b[i - 1] > 0) {
            System.out.println(new String(b, 0, i));
        } else {
            for (int j = 0; j < i; j++) {
                if (b[j] > 0) {
                    num++;
                    num = num % 2;
                } else {
                    num = 0;
                }
            }
            if (num == 0) {
                System.out.println(new String(b, 0, i));
            } else
                System.out.println(new String(b, 0, i - 1));
        }
    }
}
