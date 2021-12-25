package ceshi;

/**
 * @ClassName:Contains_panduan
 * @Description:TODO
 * @Author:wangjianhuan
 * @Date:2020/10/29 11:06
 */
public class Contains_panduan {
    public static void main(String[] args) {
        String s1 = "wo shi da sha bi";
        String s2 = "shi da d";
        boolean b;
        b = s1.contains(s2);
        // TODO: 2020/10/29 contains函数可以判断后者字符串是不是再前者字符串之内 
        System.out.println(b);
    }

}
