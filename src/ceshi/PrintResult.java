package ceshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName:InputData
 * @Description:TODO
 * @Author:wangjianhuan
 * @Date:2020/10/28 10:13
 */

class InputData {
    static private String s ="";
    static public void input(){
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        try{
            s = bu.readLine();
        }catch (IOException e){

        }
    }
    static  public int getInt(){
        input();
        return Integer.parseInt(s);
    }
}

class Result{
    void print(int d){
        System.out.println(d+"的平方"+d*d);
        System.out.println(d+"的立方"+d*d*d);
    }
}

public class PrintResult{
    public static void main(String[] args) {
        Result result = new Result();
        System.out.println("亲输入一个整数：");
        int a = InputData.getInt();
        result.print(a);
    }
}