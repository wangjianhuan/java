package ceshi;

/*
 *
 *@Author:IntelliJ IDEA
 *@Time:2020/11/8:10:50
 *
 */
public class P121 {
    static class Agg extends P121{
        public String getFields(){
            String name = "Agg";
            return name;
        }
    }
    public static class Avf{
        public static void main(String[] args) {
            P121 a = new Agg();
            System.out.println(((Agg) a).getFields());
        }
    }
}
//
// TODO: 2020/11/8 深度广度遍历算法
