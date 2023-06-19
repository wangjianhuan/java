package ceshi;

import java.util.LinkedList;

public class LastPersonStanding {
    public static int findLastPerson(int m, int n) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("人数和间隔必须大于0");
        }

        // 创建一个循环链表，并添加初始人员编号
        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= m; i++) {
            circle.add(i);
        }

        int index = 0; // 当前指向的人的索引

        while (circle.size() > 1) {
            // 找到要淘汰的人的索引
            index = (index + n - 1) % circle.size();
            circle.remove(index);
        }

        return circle.get(0);
    }

    public static void main(String[] args) {
        int m = 10; // 人数
        int n = 3; // 每隔n个人淘汰一个

        int lastPerson = findLastPerson(m, n);
        System.out.println("最后剩下的人的编号是: " + lastPerson);
    }
}

