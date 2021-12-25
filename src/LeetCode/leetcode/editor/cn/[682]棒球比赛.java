package LeetCode.leetcode.editor.cn;

import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution682 {
    public int calPoints(String[] ops) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i] == "C") {
                stack.pop();
            } else if (ops[i] == "D") {
                stack.push(String.valueOf(2 * Integer.valueOf(stack.peek())));
            } else if (ops[i] == "+") {
                String j = stack.pop();
                String k = stack.peek();
                int l = Integer.parseInt(j) + Integer.parseInt(k);
                stack.push(j);
                stack.push(String.valueOf(l));
            } else {
                stack.push(ops[i]);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            int i = Integer.valueOf(stack.pop());
            sum += i;
            System.out.println(i);
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
