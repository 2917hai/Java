import java.util.*;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Enter a number:");
        no = sc.nextInt();
        int digitCount = 0;
        int temp = no;
        while(temp>0)
        {
            digitCount++;
            temp = temp / 10;
        }
       int sum=0;
       temp=no;
       while (temp>0) {
              int power=1;  
              int digit=temp%10;
                for (int i = 1; i <= digitCount; i++) {
                    power=power*digit;
                }
                sum=sum+power;
                temp=temp/10;
             
        
       }
       System.out.println(sum);
       if(sum==no)
       {
           System.out.println("Armstrong number");
       }
       else
       {
           System.out.println("Not an Armstrong number");
       }
       sc.close();
    }
}
