package LeetCode.leetcode.editor.cn;

import java.util.HashMap;

public class ck {
    public static void main(String[] args) {
        String s = "cbbd";
        ck ck = new ck();
        System.out.println("i = " + ck.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        int length = s.length(), nums = 0;
        String str = "";
        if (length == 0 || " ".equals(s)) return "";
        for (int i = 1; i < length; i++) {
            int j, k;
            // 偶数
            j = i - 1;
            k = i;
            while (j >= 0 && k < length) {
                if (s.charAt(j) == s.charAt(k)) {
                    if ((k - j) > nums) {
                        str = s.substring(j, k+1);
                        nums = k - j;
                    }
                    j--;
                    k++;
                } else {
                    break;
                }
            }
            // 奇数
            j = i - 1;
            k = i + 1;
            while (j >= 0 && k < length) {
                if (s.charAt(j) == s.charAt(k)) {
                    if ((k - j) > nums) {
                        str = s.substring(j, k+1);
                        nums = k - j;
                    }
                    j--;
                    k++;
                } else {
                    break;
                }
            }
        }
        return str;
    }
}
