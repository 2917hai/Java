import java.util.*;
public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no;
        int count=0;
        System.out.println("Enter a number");
        no=sc.nextInt();
        for(int i=2; i<no; i++)
        {
            if(no%i==0)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("not prime");
        }
        else
        {
            System.out.println("prime");
        }
    }
}
