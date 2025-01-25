public class FactorialNumberA {
    public static void main(String []args)
    {
        int no=6;
        int fact=1;
        for(int i=2; i<=no; i++)
        {
            System.out.println(fact);
            fact=fact*i;
           // System.out.println(fact);
        }
    }
}
