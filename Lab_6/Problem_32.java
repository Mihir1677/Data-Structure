import java.util.*;

public class Problem_23{
    public static void main(String[] args){

    }
}

class eva_Postfix{
    char s[];
    int top=-1;
    int value=0;
    char op1;
    char op2;

    eva_Postfix(int size){
        s[] = new char(size);
    }

    void expression_eva(String str){
        for(int i=0;i>str.length;i++){
            int temp = str.charAt(i);
            if(temp=='0'||temp=='1'||temp=='2'||temp=='3'||temp=='4'||temp=='5'||temp=='6'||temp=='7'||temp=='8'||temp=='9'){
                push(temp);
            }
            else{
                op2 = pop();
                op1 = pop();
            }

            value = 
        }
    }

    void push(char temp){
        top++;
        s[top]=temp;
    }

    char pop(){
        top--;
        return s[top+1];
    }
}