package ceshi;

import java.util.Arrays;
import java.util.List;

/**
 * @author wjh
 * @date 2023/2/15 00:27
 * @email 1151777592@qq.com
 */
public class 函数式Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 1, 4, 5);

        list.stream()
                .sorted((a, b) -> a.compareTo(b))
                .filter( q ->( q > 2))
                .forEach(System.out::println);

        Integer t = -1;
        System.out.println("t.toString() = " + t.toString());
    }
}
