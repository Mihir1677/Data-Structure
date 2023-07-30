import java.util.*;
public class Problem_21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][2];
        System.out.println("Enter values of 3x2 matrix A: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
            a[i][j] = sc.nextInt();
            }
        }
        int b[][] = new int[2][3];
        System.out.println("\n\nEnter values of 2x3 matrix B: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
            b[i][j] = sc.nextInt();
            }
        }

        int ans[][] = new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++){
                ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("\nMatrix A * Matrix B = \n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print(ans[i][j]+" ");
            }
            System.out.print("\n");
        }
    } 
}