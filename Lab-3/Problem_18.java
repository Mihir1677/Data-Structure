import java.util.*;
public class Problem_18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            a[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = 0;
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

       System.out.println("\nEnter index location to delete the number there");
        int index = sc.nextInt();
        for(int i=index;i<n;i++){
            a[i]=a[i+1];
        }
        a[n] = 0;;

        System.out.println("\nSorted array: \n");
        for(int i=0;i<n-1;i++){
            System.out.print(" "+a[i]);
        }
    } 
}