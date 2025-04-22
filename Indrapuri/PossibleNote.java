import java.util.*;
public class PossibleNote {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total amount ");
        int amount;
        amount=sc.nextInt();
       int hundred=0;
       int fifty=0;
       int twenty=0;
       int ten=0;
       int five=0;
       int two=0;
       int one=0;
       if(amount>=100)
       {
        hundred=amount/100;
        amount=amount-(hundred*100);
       }
       else if (amount<100 && amount>=50) {
        fifty=amount/50;
        amount=amount-(fifty*50);
        
       }
       else if (amount<50 && amount>=20) {
        twenty=amount/20;
        amount=amount-(twenty*50);
        
       }
       else if (amount<20 && amount>=10) {
        ten=amount/10;
        amount=amount-(ten*50);
        
       }
       else if (amount<10 && amount>=5) {
        five=amount/5;
        amount=amount-(five*5);
        
       }
       else if (amount<5 && amount>=2) {
        two=amount/2;
        amount=amount-(two*2);
        
       }
       else if (amount<2 && amount>=1) {
        one=amount/1;
        amount=amount-(one*1);
       }
       else
       {
        System.out.println("invalid input");
       }
      System.out.println("done");
      System.out.println("100:"+hundred+"   50:"+fifty+"   20:"+twenty+"   10:"+ten+"   5:"+five+"  2:" +two+"  1:"+one);
       }
        
    }

