import java.util.*;
public class Problem_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int r = sc.nextInt();
        if(r%2==0){
            System.out.println("Given number "+r+" is Even");
        }
        else{
            System.out.println("Given number "+r+" is Odd");
        }
    }
}