import java.util.*;
public class Problem_12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value: ");
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=0;i<n;i++){
            if(min<=a[i]){
                min=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==min){
                System.out.println(" "+min+" is smallest number on position "+(i+1));
            }
        }
}
}