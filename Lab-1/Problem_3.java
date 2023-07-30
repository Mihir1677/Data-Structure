import java.util.*;
public class Problem_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet: ");
        char n = sc.next().charAt(0);
        int a[] = new int[]{'a','e','i','o','u','A','E','I','O','U'};
        boolean consonant=false;
        for(int i=0;i<a.length;i++){
            if(n==a[i]){
                consonant=true;
                break;
            }
            
        }
        if(consonant==true){
            System.out.println("Given Alphabet \""+n+"\" is Vowel");         
        }
        else{
                System.out.println("Given Alphabet \""+n+"\" is Consonant");
            }
}
}