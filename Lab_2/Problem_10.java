import java.util.*;
public class Problem_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y to print sum from x to y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum=0;
        for(int i=x;i<=y;i++){
            sum = sum + i;
        }
        System.out.println("Sum from "+x+" to "+y+" = "+sum);
}
}