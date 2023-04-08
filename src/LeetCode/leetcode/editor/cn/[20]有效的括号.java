package LeetCode.leetcode.editor.cn;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
// 每个右括号都有一个对应的相同类型的左括号。
//
//
//
//
// 示例 1：
//
//
//输入：s = "()"
//输出：true
//
//
// 示例 2：
//
//
//输入：s = "()[]{}"
//输出：true
//
//
// 示例 3：
//
//
//输入：s = "(]"
//输出：false
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 10⁴
// s 仅由括号 '()[]{}' 组成
//
//
// Related Topics 栈 字符串 👍 3833 👎 0


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class leetcode_java_20 {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for (char a : s.toCharArray()
        ) {
            switch (a) {
                case '(':
                    stack.push("(");
                    break;
                case '{':
                    stack.push("{");
                    break;
                case '[':
                    stack.push("[");
                    break;
                case ')':
                    if (stack.isEmpty())
                        return false;
                    String pop = stack.pop();
                    if (pop != "(")
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty())
                        return false;
                    String pop1 = stack.pop();
                    if (pop1 != "{")
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty())
                        return false;
                    String pop2 = stack.pop();
                    if (pop2 != "[")
                        return false;
                    break;
                default:
                    break;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
