public class SumAllPrimenumber {
    public static void main(String[]args)
    {
        int sum=0;
        //System.out.println("enter the number");
        //Scanner s=new Scanner(System.in);
       // no=s.nextInt();
        for(int no=2; no<=100; no++)
        {
            int a=0;
        for(int i=2; i<no; i++)
        {
            if(no%i==0)
            {
                a=1;
            }
        }
            if(a==0)
            {
                sum=sum+no;
            }
                System.out.println(sum);
        
            
        }

      }
    }

 


