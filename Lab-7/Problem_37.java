/*Evaluate Post-fix Expression*/

import java.util.Scanner;
import java.util.Stack;
public class Problem_37{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pre-fix expression:");
        String exp = sc.nextLine();
        StringBuffer str = new StringBuffer(exp);
        eva_postfix ep = new eva_postfix();
        ep.evaluate(str.reverse().toString());
        ep.printStack();
    }
}

class eva_postfix{
    Stack<Double> stack = new Stack<Double>();
    void evaluate(String str){
        for(int i=0;i<str.length();i++){
            char next = str.charAt(i);
            double ans;
            double op1=0;
            double op2=0;
            double num;
            if(Character.isDigit(next)){
                num = Character.getNumericValue(next);
                stack.push(num);
            }
            else{
                op1 = stack.pop();
                op2 = stack.pop();
            }
            switch (next) {
                case '+':
                    ans = op1+op2;
                    stack.push(ans);
                    break;
                    
                case '-':
                    ans = op1-op2;
                    stack.push(ans);
                    break;

                case '*':
                    ans = op1*op2;
                    stack.push(ans);
                    break;

                case '/':
                    ans = op2/op1;
                    stack.push(ans);
                    break;

                case '^':
                    ans = (Math.pow(op1, op2));
                    stack.push(ans);
                    break;
            }
        }
    }

    void printStack(){
        System.out.println(stack);
    }
}