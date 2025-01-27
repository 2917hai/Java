import java.util.*;
public class Puzzle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1,2,3,4,5,6,7,8,9");
        System.out.println("Enter a number which are given up");
        int no1,no2,no3,no4,no5,no6,no7,no8,no9;
        no1=sc.nextInt();
        System.out.println(no1);
        System.out.println("Enter next No");
        no2=sc.nextInt();
        if(no2<10 && no2==no1 || no2==no1+1 || no2==no1-1)
        {
            System.out.println("wrong it is adjacant no");
        }
        else 
         {
            System.out.println(no2);
            System.out.println("Enter next No");
            no3=sc.nextInt();
            if (no3<10 && no3==no2 || no3==no1 || no3==no2+1 || no3==no2-1) {

                 System.out.println("wrong it is adjacant no");
            }
            else
            {
                System.out.println(no3);
                System.out.println("Enter next No");
                no4=sc.nextInt();
                if (no4<10 && no4==no2 || no4==no1 || no4==no3 || no4==no3+1 || no4==no3-1) {

                    System.out.println("wrong it is adjacant no");
               }
               else
               {
                System.out.println(no4);
                System.out.println("Enter next No");
                no5=sc.nextInt();
                if (no5<10 && no5==no2 || no5==no1 || no5==no3 || no5==no4 || no5==no4+1 || no5==no4-1) {

                    System.out.println("wrong it is adjacant no");
               }
               else
               {
                System.out.println(no5);
                System.out.println("Enter next No");
                no6=sc.nextInt();
                if (no6<10 && no6==no1 || no6==no2 || no6==no3 || no6==no4 || no6==no5 || no6==no5+1 || no6==no5-1)
                 {
                    System.out.println("wrong it is adjacant no");
                 }
               else
               {
                System.out.println(no6);
                System.out.println("Enter next No");
                no7=sc.nextInt();
                if (no7<10 && no7==no1 || no7==no2 || no7==no3 || no7==no4 || no7==no5 || no7==no6|| no7==no6+1 || no7==no6-1)
                {
                   System.out.println("wrong it is adjacant no");
                }
                else
                {
                    System.out.println(no7);
                    System.out.println("Enter next No");
                    no8=sc.nextInt();
                    if (no8<10 && no8==no1 || no8==no2 || no8==no3 || no8==no4 || no8==no5 || no8==no6|| no8==no7 || no8==no7+1 || no8==no7-1)
                    {
                       System.out.println("wrong it is adjacant no");
                    }
                    else
                    {
                        System.out.println(no8);
                        System.out.println("Enter next No");
                        no9=sc.nextInt();
                        if (no9<10 && no9==no1 || no9==no2 || no9==no3 || no9==no4 || no9==no5 || no9==no6|| no9==no7 || no9==no8 || no9==no8+1 || no9==no8-1)
                        {
                           System.out.println("wrong it is adjacant no");
                        }
                        else
                        {
                            System.out.println(no9);
                        }

                    }
                }
               }
               }
               }

            }
                

         }
                
     }

}
       
    
    
