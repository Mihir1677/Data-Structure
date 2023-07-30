import java.util.*;
public class Problem_8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int n = sc.nextInt();
        int i;
        int count=0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Given number is prime -> "+n);
        }
        else{
            System.out.println("Given number is not prime -> "+n);
        }
    }
}