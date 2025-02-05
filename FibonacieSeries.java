public class FibonacieSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=5;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=1; i<=n; i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    
    }
}
