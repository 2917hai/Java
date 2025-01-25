import java.util.*;
public class Leapyearr {
    public static void main(String[] args) {
        System.out.println("enter year");
        Scanner sc= new Scanner(System.in);
        int year;
        year=sc.nextInt();
        if(year%400==0 || year%100==0)
        {
         System.out.println("year is leap Year");
        }
        else if (year%4==0) {
            System.out.println("year is leap ");
        }
        else
        {
            System.out.println("not leap year");
        }
    }
    
}
