import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[]args)
    {
        int year;
        System.out.println("enter year");
        Scanner s=new Scanner(System.in);
        year=s.nextInt();
        if(year%4==0)
        {
            System.out.println("this year ia leap");

        }
        else
        {
            System.out.println("not leap year");
        }

    }
}
