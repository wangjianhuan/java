package ceshi;


/*
 *
 *@Author:IntelliJ IDEA
 *@Time:2020/11/8:15:42
 *
 */
public class PanDuanDengZhi {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "s1";
        String s3 = "abc";
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println("s1 == s3:" + (s1 == s3));
        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s4 == s5:" + (s4 == s5));
        System.out.println("s1.equals(s2):" + s1.equals(s2));
        System.out.println("s1.equals(s5):" + s1.equals(s5));
    }
}
