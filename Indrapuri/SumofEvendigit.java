import java.util.*;
public class SumofEvendigit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int no=sc.nextInt();
        // int EvenSum=0;
        // while (no>0) {
        //     int digit=no%10;
        //     if (digit%2==0) {
        //         EvenSum=EvenSum+digit;
        //     }
        //     no=no/10;
            
        // }
        // System.out.println("sum of even digit is "+EvenSum);
        //123456
        int alternateSum=0;
        while(no>0)
        {
            int digit=no%10;
            alternateSum=alternateSum+digit;
            no=no/100;
        }
        System.out.println("sum of alternate digit is "+alternateSum);
    }
}
