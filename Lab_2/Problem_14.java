import java.util.*;
public class Problem_14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value: ");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the old number and it's replacement number: ");
        int old=sc.nextInt();
        int newnum=sc.nextInt();
        System.out.println("Changes made on these index: \n");

        for(int i=0;i<n;i++){
            if(old==a[i]){
                a[i]=newnum;
                System.out.print(" "+(i+1));
            }
            
        }+
        System.out.println("\nFinal array: ");
        
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
}
}