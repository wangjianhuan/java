package LeetCode.leetcode.editor.cn;

class leetcode_java_83 {
    public static void main(String[] args) {
        ListNode node = new ListNode();

        ListNode listNode = new leetcode_java_83().deleteDuplicates(node);
        System.out.println("listNode = " + listNode);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
//        System.gc();
        return head;
    }


}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
