import java.util.*;
public class PerfectNo {
    public static void main(String[] args) {
        System.out.println("find the perfact NO");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int no;
        no=sc.nextInt();
        int sum=0;
        for(int i=1; i<no; i++)
        {
            if(no%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==no)
        {
            System.out.println("no is perfact");
        }
        else
        {
            System.out.println("not perfact no");
        }
    }
}
