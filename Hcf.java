public class Hcf {
    public static void main(String[] args) {
        int a=12;
        int b=24;
        int Hcf=0;
        int c=(a<b? a:b);
        for(int i=1; i<=c; i++)
        {
            if(a%i==0 && b%i==0)
            {
                 Hcf=i;
            }
        }
        System.out.println(Hcf);
        System.out.println("LCM is"+(a*b/Hcf));
       
    }
    
}
