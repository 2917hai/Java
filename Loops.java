public class Loops {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0; i<10; i++)
        {
            sum=sum+i;

        }
        System.out.println(sum);
        ///////////////////////////////////////////////////////////////////
        int sum1=0;
        int j=0;
        while (j<10) {
            sum1=sum1+j;
            j++;
        }
        System.out.println(sum1);
        //////////////////////////////////////////////////////////////////
        int k=0;
        int sum3=0;
        do
        {
           
            sum3=sum3+k;
            k++;
        }
        while(k<10);
        System.out.println(sum3);
    
        
    }
}
