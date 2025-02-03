import java.util.*;
public class Palidrom {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        int no;
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        int sum=no;
        int rem;
        int rv=0;
        while (sum!=0)
        {
           rem=sum%10;
           rv=rv*10+rem;
           sum=sum/10;
        }
        if(no==rv)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
       
    }
}
