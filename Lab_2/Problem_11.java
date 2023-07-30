import java.util.*;
public class Problem_11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print average till that number: ");
        int n = sc.nextInt();
        double i;
        double sum=0;
        double avg=0;
        double max=0;
        for(i=1;i<=n;i++){
            sum = sum + i;
            max = i;
        }
        avg = sum/max;
        System.out.println("Average till "+n+" = "+avg); 
}
}