import java.util.*;
public class Problem_15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter a number to add in array");
        int num = sc.nextInt();
        System.out.println("Enter index location to add the number there");
        int index = sc.nextInt();
        for(int i=n-1;i>=index;i--){
            a[i+1]=a[i];
        }
        a[index] = num;
        for(int i=0;i<=n;i++){
            System.out.print(" "+a[i]+" ");
        }
    } 
}