public class ApSeries {
    public static void main(String[] args) {
        int a=1;
        int n=6;
        int d=2;
        int term=0;
        for(int i=1; i<=n; i++)
        {
            term=a+i*d;
            System.out.print(term+"\t");
        }
    }
}
