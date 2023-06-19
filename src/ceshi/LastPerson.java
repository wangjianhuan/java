package ceshi;

import java.util.ArrayList;
import java.util.LinkedList;

public class LastPerson {

    private int findLastPerson(int nums, int count) {
        if (nums <= 0 || count <= 0) {
            throw new IllegalArgumentException("总人数或者人数间隔错误!");
        }

        // 创建一个链表 用来模拟圆环
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums; i++) {
            list.add(i);
        }
        int index = 0;

        while (list.size() > 1) {
            // 间隔数被总人数取余  当当前人索引加上间隔人数大于总人数时可以从头开始继续
            index = (index + count - 1) % list.size();
            list.remove(index);
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        int nums = 2;
        int count = 3;
        LastPerson person = new LastPerson();
        int lastPerson = person.findLastPerson(nums, count);
        System.out.println("lastPerson = " + lastPerson);
    }
}
