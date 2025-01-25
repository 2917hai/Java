
import java.util.Scanner;
public class Calculator {
    public static void main(String[]args)
    {
        int a;
        int b;
        int no;
        System.out.println("calculator");
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("choose a number for operation performing");
       // no=s.nextInt();
        
        System.out.println("   1).  +   for the Summition");
        System.out.println("   2).  -   for the abstraction");
        System.out.println("   3).  *   for the multiplication");
        System.out.println("   4).  /   for the devision");
    
        System.out.println("choose a number for operation performing");

       //Scanner s=new Scanner(System.in);
        no=s.nextInt();
       
       switch(no)
       {
        case 1:
        System.out.println("sum are  " +(a+b));
        break;
        case 2:
        System.out.println("div  are  " +(a-b));
        break;
        case 3:
        System.out.println("mult  are  " +(a*b));
        break;
        case 4:
        System.out.println("div  are  " +(a/b));
        break;
        default:
        System.out.println("invalid number");
        break;
       }

    }
}
