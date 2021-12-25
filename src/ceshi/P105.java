package ceshi;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:P105
 * @Description:TODO
 * @Author:wangjianhuan
 * @Date:2020/10/29 12:47
 */
public class P105 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String,String>();
        map.put(String.valueOf(System.nanoTime())+"a","1");
        map.put(String.valueOf(System.nanoTime())+"a","2");
        map.put(String.valueOf(System.nanoTime())+"a","3");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}