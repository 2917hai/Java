import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[]args)
    {
        int no;
        int a=0;
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        no=s.nextInt();
        for(int i=2; i<=no-1; i++)
        {
            if(no%i==0)
            {
                a=1;
            }
            if(a==1)
            {
                System.out.println(no+ "   not prime number");
                break;
            }
        
            if(a==0)
            {
                System.out.println(no+ "   is prime");
                break;
            }
        }

    }
}
