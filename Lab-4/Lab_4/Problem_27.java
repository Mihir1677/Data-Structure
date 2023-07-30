import java.util.*;
class Stack{
    Scanner sc = new Scanner(System.in);
    int top;
    int s[];
    int size; 

    Stack(int size){
        top = -1;
        this.size = size;
        s = new int[size];
    }

    void push(){
        if(top>=size-1){
            System.out.println("\n\t-- Stack Overflow --");
            System.exit(0);
        }
        else{
            System.out.println("\n\tEnter value to push");
            int x = sc.nextInt();
            top = top + 1;
            s[top] = x;
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("\n\t-- Stack Underflow --");
            System.exit(0);
        }
        else{   
            top = top - 1;
            System.out.println("\n\tPOP Element: "+s[top+1]);
            s[top+1] = 0;
        }
    }

    
    void peep(int i){
        if(top-i+1<=-1){
            System.out.println("\n\t-- Stack Underflow --");
        }
        else{
            System.out.println("\t\nPEEP Element: "+s[top-i+1]);
        }
    }

    void change(int i, int x){
        if(top-i+1<=-1){
            System.out.println("\n\t-- Stack Underflow --");
        }
        else{
            s[top-i+1]=x;
            System.out.println("\n\tChanges Made on Index: "+(i+1)+"\nStack: ");
        }
    }


    void printStack(){
        System.out.println("\n\t=\t\t=");
        for(int i=top;i>=0;i--){
            System.out.println("\t\t"+s[i]);
        }
        System.out.println("\t=\t\t=");
    }
}

public class Problem_27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Stack: ");
        int size = sc.nextInt();
        Stack st = new Stack(size);
        int check;
        int i;
        int x;
        while(true){
            System.out.println("\nEnter 1 for PUSH\nEnter 2 for POP\nEnter 3 for PEEP\nEnter 4 for CHANGE\nEnter 0 to Print Stack\nEnter -1 for Exit");
            check=sc.nextInt();
            switch(check){
                case 1:
                    st.push();
                    break;

                case 2:
                    st.pop();
                    break;

                case 3:
                    System.out.println("\n\tEnter index to PEEP: ");
                    i = sc.nextInt();
                    st.peep(i);
                    st.printStack();
                    break;
                    
                case 4:
                    System.out.println("\n\tEnter index for changing element with the CHANGE element:");
                    i = sc.nextInt();
                    x = sc.nextInt();
                    st.change(i,x);
                    break;

                case 0:
                    st.printStack();
                    break;

                case -1:
                    System.exit(0);
            }
           
        }
        
    }
}