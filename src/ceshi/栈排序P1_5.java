package ceshi;

import java.util.Stack;

/**
 *
 *@Author:IntelliJ IDEA
 *@Time:2020/11/15:14:15
 *
 */
public class 栈排序P1_5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] a = {4, 3, 5, 4, 3, 3, 6, 7};
        int[] ints = Stacksort(a, 3);
        for (int i : ints)
            System.out.println(i);
    }

    private static int[] Stacksort(int[] a, int k) {
        int b[] = new int[k];
        int c[] = new int[a.length];
        int x = k;
        for (int i = 0; i < a.length - k; i++) {
            for (int j = 0 ; j < k ; j++)
                b[j] = a[i+j];
            c[i] = tmp(b, x);}
        return c;
    }

    private static int tmp(int[] a, int k) {
        int x = 0;
        for (int i = 0; i < k-1; i++)
            x = a[i] > a[i + 1] ? a[i] : a[i + 1];
        return x;
    }
}
