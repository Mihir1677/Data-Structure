import java.util.*;
public class Problem_16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter index location to delete the number there");
        int index = sc.nextInt();
        for(int i=index;i<n;i++){
            a[i]=a[i+1];
        }
        a[n] = 0;
        for(int i=0;i<n-1;i++){
            System.out.print(" "+a[i]+" ");
        }
    } 
}