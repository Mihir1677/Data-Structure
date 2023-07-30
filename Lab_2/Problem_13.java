import java.util.*;
public class Problem_13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value: ");
            a[i]=sc.nextInt();
        }
        boolean dupe=false;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]==a[i]){
                    dupe=true;
                    break;
                }
            }
        }
        if(dupe==true){
            System.out.println("Array contains duplicate values");
        }
        else{
            System.out.println("Array contains no duplicate values");
        }

}
}