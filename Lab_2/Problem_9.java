import java.util.*;
public class Problem_9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value: ");
            a[i]=sc.nextInt();
        }
        System.out.println("Your array: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
}
}