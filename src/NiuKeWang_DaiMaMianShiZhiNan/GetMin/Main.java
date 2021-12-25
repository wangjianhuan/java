package NiuKeWang_DaiMaMianShiZhiNan.GetMin;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static class myStack{
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public myStack(){
            this.stackData = new Stack<>();
            this.stackMin = new Stack<>();
        }

        public void push(int newNum){
            if (stackMin.isEmpty() || this.getMin()>newNum)
                this.stackMin.push(newNum);
            this.stackData.push(newNum);
        }

        public int pop() throws Exception {
            if (stackData.isEmpty()){
                throw new Exception("your starkData is empty!");
            }
            int vaule = this.stackData.pop();
            if (vaule == this.getMin())
                this.stackMin.pop();
            return vaule;
        }

        public int getMin(){
            if (stackMin.isEmpty()){
                throw new RuntimeException("your starkMin is empty!");
            }
            return stackMin.peek();
        }
    }

    public static void main(String[] args) throws Exception {
        myStack myStack = new myStack();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
//        scanner.nextLine();
        String[] line;
        for(int i = 0; i < N;){
            line = scanner.nextLine().split(" ");
            if(line[0].equals("getMin")){
                System.out.println(myStack.getMin());
                i++;
            }else if(line[0].equals("push")){
                myStack.push(Integer.valueOf(line[1]));
                i++;
            }else if(line[0].equals("pop")){
                myStack.pop();
                i++;
            }
        }
    }
}
