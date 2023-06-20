package ceshi;

import java.util.*;

public class OptionalTest {
    public static void main(String[] args) {

//        Student student1 = new Student();
//        Student student = null;
//
//        Optional<Student> opt = Optional.ofNullable(student);
//        // 兜底写法  如果前面的为空,则选择后面的对象,否则选用前面的对象
//        Student student2 = Optional.ofNullable(student).orElse(student1);
//
//        System.out.println("opt = " + opt);
//
//        if (opt.isPresent()) {
//            Student student3 = opt.get();
//            System.out.println("student1 = " + student3);
//        } else {
//            System.out.println(" opt为空! ");
//        }

// >......>>>>>>>>>>>>>>>>>>>>>>>>>>>>.............>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Student student = new Student();

        Student dage = student.setName("dage");

        String wangjianhuan = Optional.of(student).map(Student::getName).orElse("wangjianhuan");

        System.out.println("wangjianhuan = " + wangjianhuan);

        List<Integer> list = Arrays.asList(111, 222, 333, 444, 231);

//        Arrays.sort(list,(Integer a,Integer b)->a.compareTo(b));
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int i = o1.compareTo(o2);
                return i;
            }
        });

        System.out.println("list = " + list);



        int a = 10;
        int b = 20;

        a = a ^ b; // 将a与b进行异或操作，并将结果赋值给a
        b = b ^ a; // 将a与b进行异或操作，并将结果赋值给b，此时b的值变为原来的a的值
        a = a ^ b; // 将a与b进行异或操作，并将结果赋值给a，此时a的值变为原来的b的值

        System.out.println("a = " + a); // 输出交换后的a的值
        System.out.println("b = " + b); // 输出交换后的b的值

    }
}
