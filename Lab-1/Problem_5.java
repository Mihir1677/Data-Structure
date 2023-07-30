import java.util.*;
class FactR{
    public int findFact(int n){
        if(n==1){
            return 1;
        }
        return n * findFact*(n-1);
    }
}


public class Problem_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter integer to find its factorial: ");
            int n = sc.nextInt();
            FactR f = new FactR();
            System.out.println(""+n+"! = "+f.findFact(n));        
    }
}