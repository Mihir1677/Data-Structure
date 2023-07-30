import java.util.*;
public class Problem_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();
        double ans = 3.14 * r * r;
        System.out.println("Area of circle with radius "+r+" = "+ans);
    }
}