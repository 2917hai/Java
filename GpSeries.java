public class GpSeries {
    public static void main(String[] args) {
        
        int n=6;
        int a=5;
        int r=2;
         int gp=a;
         for(int i=1; i<n; i++)
         {
            gp=gp*5;
            System.out.print(gp+"\t");
         }


         double aa=1;
         int nn=6;
         int rr=3;
         double term=0;
         double term1=0;
         for(int i=1; i<=nn; i++)
         {
            term=a*Math.pow(rr, (nn-1));
            term1=a*Math.pow(rr, i);
            System.out.println(term1);
         }
         System.out.println(term);
      
    }
}
