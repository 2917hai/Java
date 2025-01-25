public class FibonacciSeriesU {
    public static void main(String[]args)
    {
        int no1=0;
        int no2=1;
        System.out.println(no1+ "_" +no2);
        for(int i=1; i<=5; i++)
        {
            int c=no1+no2;
            System.out.println(c);
            no1=no2;
            no2=c;
        }
    }
}
