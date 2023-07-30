import java.util.*;
public class Problem_6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base and it's power: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans=1;
        for(int i=1;i<=y;i++){
            ans=ans*x;
        }
        System.out.println("Answer = "+ans);
}
}