/*Evaluate Post-fix Expression*/

import java.util.Scanner;
import java.util.Stack;
public class Problem_36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Post-fix expression:");
        String exp = sc.nextLine();
        eva_postfix ep = new eva_postfix();
        ep.evaluate(exp);
        ep.printStack();
    }
}

class eva_postfix{
    Stack<Double> stack = new Stack<Double>();
    void evaluate(String exp){
        for(int i=0;i<exp.length();i++){
            char next = exp.charAt(i);
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