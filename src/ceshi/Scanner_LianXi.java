package ceshi;

import java.util.Scanner;

/**
 * @ClassName:Scanner_LianXi
 * @Description:TODO
 * @Author:wangjianhuan
 * @Date:2020/10/28 10:30
 */
public class Scanner_LianXi {
    public static void main(String[] args) {
        System.out.println("请输入你的姓名：");
        String name = new Scanner(System.in).nextLine();
        System.out.println("请输入你的年龄：");
        int age = new Scanner(System.in).nextInt();
        System.out.println("请输入你的工资：");
        float salary = new Scanner(System.in).nextFloat();
        System.out.println("你的信息如下：");
        System.out.println("姓名：" + name + "\n年龄：" + age + "\n" + "工资：" + salary);
    }
}
