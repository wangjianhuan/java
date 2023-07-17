package ceshi;


/**
 * 假设有一个主文本字符串为"ABABABABCABABABCABABABC"，我们要在该字符串中查找模式字符串"ABABCABABABC"的出现位置。
 * <p>
 * 首先，我们使用KMP算法构建部分匹配表（Next数组）：
 * <p>
 * 模式字符串："ABABCABABABC"
 * Next数组：[-1, 0, 0, 1, 2, 0, 1, 2, 3, 4, 5, 3]
 * <p>
 * 接下来，我们在主文本字符串中进行匹配：
 * <p>
 * 主文本字符串："ABABABABCABABABCABABABC"
 * 模式字符串："ABABCABABABC"
 * <p>
 * 初始状态，主文本指针指向第一个字符，模式字符串指针指向第一个字符。
 * 比较第一个字符"A"，匹配成功，继续比较下一个字符。
 * 比较第二个字符"B"，匹配成功，继续比较下一个字符。
 * 比较第三个字符"A"，匹配成功，继续比较下一个字符。
 * 比较第四个字符"B"，匹配成功，继续比较下一个字符。
 * 比较第五个字符"C"，匹配失败。根据部分匹配表，模式字符串指针需要向前移动2个位置。
 * 比较第五个字符"C"，匹配失败。根据部分匹配表，模式字符串指针需要向前移动1个位置。
 * 比较第五个字符"C"，匹配成功，继续比较下一个字符。
 * 比较第六个字符"A"，匹配成功，继续比较下一个字符。
 * 比较第七个字符"B"，匹配成功，继续比较下一个字符。
 * 比较第八个字符"A"，匹配成功，继续比较下一个字符。
 * 比较第九个字符"B"，匹配成功，继续比较下一个字符。
 * 比较第十个字符"C"，匹配成功，模式字符串匹配完成。
 * 最终，我们找到了模式字符串在主文本字符串中的起始位置为8。
 * <p>
 * 这是一个简单的示例，演示了KMP算法在字符串匹配中的应用。通过构建部分匹配表和利用Next数组的信息，KMP算法可以高效地在文本中查找模式字符串的出现位置。假设有一个主文本字符串为"ABABABABCABABABCABABABC"，我们要在该字符串中查找模式字符串"ABABCABABABC"的出现位置。
 * <p>
 * 首先，我们使用KMP算法构建部分匹配表（Next数组）：
 * <p>
 * 模式字符串："ABABCABABABC"
 * Next数组：[-1, 0, 0, 1, 2, 0, 1, 2, 3, 4, 5, 3]
 * <p>
 * 接下来，我们在主文本字符串中进行匹配：
 * <p>
 * 主文本字符串："ABABABABCABABABCABABABC"
 * 模式字符串："ABABCABABABC"
 * <p>
 * 初始状态，主文本指针指向第一个字符，模式字符串指针指向第一个字符。
 * 比较第一个字符"A"，匹配成功，继续比较下一个字符。
 * 比较第二个字符"B"，匹配成功，继续比较下一个字符。
 * 比较第三个字符"A"，匹配成功，继续比较下一个字符。
 * 比较第四个字符"B"，匹配成功，继续比较下一个字符。
 * 比较第五个字符"C"，匹配失败。根据部分匹配表，模式字符串指针需要向前移动2个位置。
 * 比较第五个字符"C"，匹配失败。根据部分匹配表，模式字符串指针需要向前移动1个位置。
 * 比较第五个字符"C"，匹配成功，继续比较下一个字符。
 * 比较第六个字符"A"，匹配成功，继续比较下一个字符。
 * 比较第七个字符"B"，匹配成功，继续比较下一个字符。
 * 比较第八个字符"A"，匹配成功，继续比较下一个字符。
 * 比较第九个字符"B"，匹配成功，继续比较下一个字符。
 * 比较第十个字符"C"，匹配成功，模式字符串匹配完成。
 * 最终，我们找到了模式字符串在主文本字符串中的起始位置为8。
 * 这是一个简单的示例，演示了KMP算法在字符串匹配中的应用。通过构建部分匹配表和利用Next数组的信息，KMP算法可以高效地在文本中查找模式字符串的出现位置。
 */
public class KMPAlgorithm {
    public static int findPattern(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] next = calculateNext(pattern);

        int i = 0; // 主文本字符串指针
        int j = 0; // 模式字符串指针

        while (i < n && j < m) {
            char chati = text.charAt(i);
            char chatj = pattern.charAt(j);
            if (chati == chatj) {
                i++;
                j++;
            } else {
                if (j > 0) {
                    j = next[j - 1];
                } else {
                    i++;
                }
            }
        }

        if (j == m) {
            return i - m; // 返回模式字符串在主文本字符串中的起始位置
        } else {
            return -1; // 模式字符串未在主文本字符串中找到
        }
    }

    private static int[] calculateNext(String pattern) {
        int m = pattern.length();
        int[] next = new int[m];

        int i = 1;
        int j = 0;

        next[0] = 0;

        while (i < m) {
            char chati = pattern.charAt(i);
            char chatj = pattern.charAt(j);
            if (chati == chatj) {
                j++;
                next[i] = j;
                i++;
            } else {
                if (j > 0) {
                    j = next[j - 1];
                } else {
                    next[i] = 0;
                    i++;
                }
            }
        }

        return next;
    }

    public static void main(String[] args) {
        String text = "ABABABABCABABABCABABABC";
        String pattern = "ABABCABABABC";

        int index = findPattern(text, pattern);

        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }
}

