package ceshi;

/**
 * @ClassName:ChuanZhi
 * @Description:TODO
 * @Author:wangjianhuan
 * @Date:2020/10/27 22:57
 */
public class ChuanZhi {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i="+i);
        test(i);
        System.out.println("after i = "+i);
    }
    static void test(int a){
        a=5;
        System.out.println("a="+a);
    }
}
