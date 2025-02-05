
import java.util.*;
public class Armstrong1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no;
        no=sc.nextInt();
        int length=0;
        while (no>0) {
            no=no/10;
            length++;
        }
        int rem;
        int sum=0;
        int no1=no;
        int mult;
        while (no1>0) {
            mult=1;
            rem=no1%10;
            for(int i=0; i<=length; i++)
            {
              mult=mult*rem;  
            }
           sum=sum+mult;
           no1=no1/10;
        } 
        if(sum==no)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("Not a armstron Number");
        }
    }
}
