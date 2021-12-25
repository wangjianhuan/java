package ceshi;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count {
    public static void main(String[] args) throws IOException {
        // 获取数据
        FileReader paper = new FileReader("C:/soft/samp.txt");
        Map<String, Integer> map = new HashMap<>();
        char[] buf = new char[1024];
        int num = 0;
        String word = "";
        while ((num = paper.read(buf)) != -1) {
            word = new String(buf, 0, num);
        }
        // 匹配单词
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(word.trim());
        ArrayList<String> l1 = new ArrayList();
        while (m.find()) {
            l1.add(m.group());
        }
        // 将相同键的值 +1
        for (int i = 0; i < l1.size(); i++) {
            map.put(l1.get(i), map.containsKey(l1.get(i)) ? map.get(l1.get(i)) + 1 : 1);
        }
        // 遍历输出
//        for (String key : map.keySet()) {
//            System.out.println(key + ": " + map.get(key));
//        }
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue() - o1.getValue());
            }
        });
        if (list.size() < 10) {
            throw new RuntimeException("您的论文不够100词");
        }
        List<Map.Entry<String, Integer>> list1 = list.subList(0, 10);
        for (Map.Entry<String, Integer> key : list1
        ) {
            System.out.println(key);
        }
    }
}
