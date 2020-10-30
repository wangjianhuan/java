package ceshi;

import static java.lang.Character.getNumericValue;

public class Tostring_fangfa {
    public static void main(String[] args) {
        int i1 = 10;
        float f1 = 3.14f;
        double d1 = 3.1415926;
        Integer I1 = new Integer(i1);
        Float F1 = new Float(f1);
        Double D1 = new Double(d1);
        String si1 = I1.toString();
        String sf1 = F1.toString();
        String sd1 = D1.toString();


        char c = '1';
//        Character C = new Character(c);
        int a = getNumericValue(c);
        System.out.println(a);
        System.out.println(si1);
        System.out.println(sf1);
        System.out.println(sd1);
        System.out.println("-----------------------------------------");
        System.out.println(I1);
        System.out.println(F1);
        System.out.println(D1);
    }
}
