package NiuKeWang_HuaWeiJavaTiKu;

import java.util.Scanner;

/**
 * @author wjh
 * @date 2022/3/6 10:55 PM
 * @email 1151777592@qq.com
 */
public class HJ1_字符串最后一个单词的长度 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int len = huaWeiCode1(str);
        System.out.println(len);
    }

    private static int huaWeiCode1(String str) {
        String[] s = str.split(" ");
        int length = s[s.length - 1].length();
        return length;
    }
}
