package lianxi;

/**
 * @Author wangjianhuan
 * @Date 2021/1/29  11:19
 * @Emil : wangjh1256@163.com
 */

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.HashMap;
import java.util.Stack;

/**
 * 给定一个字符串，找出不含重复字符的最长子串及其长度
 */
public class ZuiChangZiChuan {
    public static void main(String[] args) {
        String str = "sdhwebdgsbdabcdefghksijduxchsga";
        zuiChangZiChuan(str);
    }

    private static void zuiChangZiChuan(String str) {
        int length = str.length();
        String string = null;
        Stack<String> stack = new Stack<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.clear();
            for (int j = i; j < length; j++) {
                if (map.get(str.charAt(j)) == null) {
                    map.put(str.charAt(j), 1);
                } else break;
            }

            if (map.size() > stack.size()) {
                while (!stack.empty()) {
                    stack.pop();
                }
                for (int k = i; k < map.size() + i; k++) {
                    stack.push(String.valueOf(str.charAt(k)));
                }
            }
        }
        Stack<String> stack_nixu = new Stack<>();
        while (!stack.empty()) {
            stack_nixu.push(stack.pop());
        }
        System.out.print("最长长度：" + stack_nixu.size() + " 最长子串：");
        while (!stack_nixu.empty()) {
            System.out.print(stack_nixu.pop());
        }
    }
}
