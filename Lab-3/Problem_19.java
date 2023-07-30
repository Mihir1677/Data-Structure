import java.util.*;
public class Problem_19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array A: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("\n");
        for(int i=0;i<n;i++){
            System.out.println("Enter value for array A: ");
            a[i] = sc.nextInt();
        }
        System.out.println("\n");        
        System.out.println("Enter size of array B: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        
        System.out.println("\n");        
        for(int i=0;i<m;i++){
            System.out.println("Enter value for array B: ");
            b[i] = sc.nextInt();
        }

        int merge = n+m;
        int countera = 0;
        int counterb = 0;
        int arymerge[] = new int[merge];
        for(int i=0;i<merge;i++){
            if(i<n){
                arymerge[i] = a[countera];
                countera++;

            }
            else{
                arymerge[i] = b[counterb];
                counterb++;
            }
        }
        System.out.println("Merged Array: \n\n");
        for(int i=0;i<merge;i++){
            System.out.print(" "+arymerge[i]);
        }
    } 
}