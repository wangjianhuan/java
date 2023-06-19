package ceshi;

import java.util.LinkedList;

public class Last_Test {


    public static void main(String[] args) {
        int nums = 108789;
        int num = 2;
        int i = lastPersonStandingTest(nums, num);
        System.out.println("i = " + i);
    }

    private static int lastPersonStandingTest(int nums, int num) {

        LinkedList<Integer> list = new LinkedList<>();

        if (num <= 0 || nums <= 0) {
            return -1;
        }

        for (int i = 1; i <= nums; i++) {
            list.add(i);
        }

        int index = 0;

        while (list.size() > 1) {
            index = (index + num - 1) % list.size();
            list.remove(index);
        }

        return list.getFirst();
    }
}
