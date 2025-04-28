import java.util.*;
public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int no=sc.nextInt();
        int sum=0;
        while (no>0) {
            int digit=no%10;
            sum=sum+digit;
            no=no/10;
            
        }
        System.out.println("sum of digit is "+sum);
        
    }
}
