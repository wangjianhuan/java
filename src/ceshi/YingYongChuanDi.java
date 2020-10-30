package ceshi;

/**
 * @ClassName:YingYongChuanDi
 * @Description:TODO
 * @Author:wangjianhuan
 * @Date:2020/10/28 9:27
 */
public class YingYongChuanDi {
    static void test(StringBuffer str){
        str.append(5);
    }

    public static void main(String[] args) {
        StringBuffer string = new StringBuffer("hello");
        test(string);
        System.out.println(string);

    }
}
