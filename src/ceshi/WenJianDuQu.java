package ceshi;

import java.io.*;

/**
 * @ClassName:WenJianDuQu
 * @Description:TODO
 * @Author:wangjianhuan
 * @Date:2020/10/28 9:54
 */
public class WenJianDuQu {
    public static void main(String[] args) {
        try {
            final FileInputStream out = new FileInputStream("duquwenjian.txt");
            out.read("字符串写入文件".getBytes());
            out.close();
        }catch (Exception e){
            System.out.println("出错了！");
        }
    }

}
