import java.util.*;

class swap{
    void swapnum(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping\nA = "+a+"\nB = "+b);
    }
}

public class Problem_22{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap s = new swap();
        s.swapnum(a,b);
    }
}