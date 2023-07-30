import java.util.*;

class Recognize_String{
    int top=-1;
    char arr[] = new char[10];

    public void recognize(String st){
        boolean flag=true;
        char character = st.charAt(0);          
        st = st+" ";                        
        System.out.println("String "+st);  
        int index = 0;
        for(int i=0; character!='c';i++){
            if(character==' '){
                System.out.println("Invalid String");
                break;
            }
            push(character);
            index++;
            character = st.charAt(i);
        }
        display();
        // index++;
            char temp = pop();
        for(int i=0;top>0;i++){
            //  && temp != ' '
            if(temp!=st.charAt(index)){
                flag=false;
                break;
            }
            temp = pop();
            index++;
        }   
        if(flag){
            if(st.charAt(index+1)==' '){
                System.out.println("Valid String");
            }else{
                System.out.println("Invalid String ");
            }
        }
        else{
                System.out.println("Invalid String ");
        }
    }

    public void push(char c ){
        if(top>=arr.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        else{
            top++;
            arr[top]=c;
        }
    }
    public char pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            System.exit(0);
            return '@';
        }
        else{
            top--;
            return arr[top+1];
        }
    }

    public void display(){
        for(int i=top;i>0;i--){
            System.out.println(arr[i]);
        }
    }
}
public class Recognize{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        Recognize_String r1 = new Recognize_String();
        r1.recognize(st);
    }
} 