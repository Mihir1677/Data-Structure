import java.util.*;
public class Problem_7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter integer to find its factor: ");
            int n = sc.nextInt();
            System.out.println("Factors of "+n+" are :");
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.print(" "+i);
                }
            }
        
    }
}