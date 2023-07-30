import java.util.*;
public class Problem_20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        System.out.println("Enter values of 2x2 matrix A: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            a[i][j] = sc.nextInt();
            }
        }
        int b[][] = new int[2][2];
        System.out.println("\n\nEnter values of 2x2 matrix B: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            b[i][j] = sc.nextInt();
            }
        }
        int ans[][] = new int [2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                ans[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("\nMatrix A + Matrix B = \n");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            System.out.print(ans[i][j]+" ");
            }
            System.out.print("\n");
        }
    } 
}