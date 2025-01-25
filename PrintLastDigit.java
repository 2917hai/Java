import java.util.*;
public class PrintLastDigit {
    public static void main(String[] args) {
        System.out.println("enter No");
        int no;
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        System.out.println(no%10);
        int no1=no%10;
        if(no1%3==0)
        {
            System.out.println("No is divisible by 3");
        }
        else
        {
            System.out.println("Number is not divisible by 3");
        }
    }
    
}
