package ceshi;

/**
 * @ClassName:GouZaoHanShu
 * @Description:TODO
 * @Author:wangjianhuan
 * @Date:2020/10/29 21:13
 */
// TODO: 2020/10/29 派生类调用构造函数时的优先权（父类还是子类）

class A{
    public A(){
        System.out.println("父类：A");
    }
    public A(int i){
        System.out.println("父类带参数：A");
    }
}
class B extends A{
    public B(){
        System.out.println("子类：B");
    }
    public B(int i){
        super(i);
        System.out.println("子类带参数：B");
    }
}
public class GouZaoHanShu {
    public static void main(String[] args) {
        B b = new B(100);
    }
}
// TODO: 2020/10/29 派生类会调用父类的构造方法  一般都是默认无参方法  可以通过super（）调用带参的构造方法
