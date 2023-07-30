import java.util.*;
public class Problem_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter integer to find its factorial: ");
            int n = sc.nextInt();
            System.out.println("Factorial of "+n+"! is :");
            int fact=1;
            for(int i=n;i>0;i--){
                fact = fact * i;
            }
            System.out.print(" "+fact);
        
    }
}