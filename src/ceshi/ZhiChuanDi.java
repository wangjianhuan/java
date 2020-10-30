package ceshi;

/**
 * @ClassName:ZhiChuanDi
 * @Description:TODO
 * @Author:wangjianhuan
 * @Date:2020/10/28 9:21
 */
public class ZhiChuanDi {
    public static void test(boolean test){
        test =!test;
        System.out.println("In test(boolean):test = "+test);
    }

    public static void main(String[] args) {
        boolean test = true;
        System.out.println("Before test(boolean):test = "+test);
        test(test);
        System.out.println("After test(boolean):test = "+test);
    }
}
