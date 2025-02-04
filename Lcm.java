import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        int lcm;
        System.out.println("Enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=(a>b? a:b);
        for(int i=c; ; i=i+c)
        {
          if(i%a==0 && i%b==0)
          {
            lcm=i;
            break;
          }
        }
        System.out.println(lcm);
    }
}
