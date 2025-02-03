import java.util.*;
public class ArmStrongNumber {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
       int no;
       no=sc.nextInt();
       int t1=no;
       int length=0;
       while(t1!=0)
       {
        t1=t1/10;
        length=length+1;
       }
       int t2=no;
       int rem;
      int  mul;
       int sum=0;
       while(t2!=0)
       {
         mul=1;
         rem=t2%10;
         for(int i=1; i<=length; i++)
         {
            mul=mul*rem;
         }
         sum=sum+mul;
         t2=t2/10;

       }
       
    
       if(sum==no)
       {
        System.out.println("number is armstromg");
            
       }
       else{
        System.out.println("number are not armstrong");
            
       }
      }
   }
   

