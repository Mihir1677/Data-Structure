import java.util.Scanner;

class Queue{
    int q[];
    int f=-1;
    int r=-1;
    int n;
    int y;

    Queue(int length){
        q = new int[length];
        this.n = length;
    }

    void enqueue(int y){
        if(r>=n){
            System.out.println("\t== Overflow ==");
            System.exit(0);
        }
        else{
            r++;
            q[r]=y;
            if(f==-1){
                f++;
            }
        }
    }

    int dequeue(){
        if(f==-1){
            System.out.println("\t== Underflow ==");
            System.exit(0);
        }
        else{
            y = q[f];
            q[f]=0;
            if(f==r){
                f=-1;
                r=-1;
            }
            else{
                f++;
            }
        }
        return y;
    }

    void printQueue(){
        System.out.println("Queue Print: \n\t");
        for(int i=0; i<=r; i++){
            System.out.print(q[i]+" ");
        }
    }
}

public class Problem_48{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Queue Size: ");
        int length = sc.nextInt();
        Queue qe = new Queue(length);
        int check=0;
        while(check!=-1){
        System.out.println("\nEnter 1 for ENQUEUE: \nEnter 2 for DEQUEUE: \nEnter 0 to print Queue:\nEnter -1 for exit: ");
        check = sc.nextInt();
        switch(check){
            case 1:
                System.out.println("Enter value to enqueue it: ");
                int y = sc.nextInt();
                qe.enqueue(y);
                break;
            case 2:
                int dq = qe.dequeue();
                System.out.println("\n\tDequeued Element: "+dq);
                break;
            case 0:
                qe.printQueue();
                break;
        }
    }
    }
}