public class ArmStrongNumber {
    public static void main(String[]args)
    {
       int no=153;
       int t1=no;
       int length=0;
       while(t1!=0)
       {
        t1=t1/10;
        length=length+1;
       }
       int t2=no;
       int rem=0;
      int  mul=1;
       int sum=0;
       while(t2!=0)
       {
         rem=t2%10;
         t2=t2/10;

       }
       for(int i=1; i<=length; i++)
       {
          mul=mul*rem;
       }
        sum=sum+mul;
    
       if(sum==no)
       {
        System.out.println("number is armstromg");
            
       }
       else{
        System.out.println("number are not armstrong");
            
       }
      }
   }
   

