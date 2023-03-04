package ceshi;

/**
 * @author wjh
 * @date 2022/6/12 10:32 PM
 * @email 1151777592@qq.com
 */
public class Girl {
    Person person = new Person("Girl");
    static{
        System.out.println("Girl static");
    }
    static Person staticPerson = new Person("GirlStaticPerson");
    public Girl() {
        System.out.println("Girl constructor");
    }
    public static void main(String[] args) {
        new MyGirlFriend();
    }
}
class Person{
    static{
        System.out.println("person static");
    }
    static Person staticPerson = new Person("PersonStaticPerson");
    public Person(String str) {
        System.out.println("person "+str);
    }
}
class MyGirlFriend extends Girl {
    Person person = new Person("MyGirlFriend");
    static Person myStaticPerson = new Person("MyStaticPerson");
    static{
        System.out.println("MyGirlFriend static");
    }
    public MyGirlFriend() {
        System.out.println("MyGirlFriend constructor");
    }

}