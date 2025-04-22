import java.util.*;
public class Input {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String ");
        String s=sc.nextLine();
        System.out.println("enter any number ");
        int a =sc.nextInt();
        int b,c;
        String s1,s2;
        System.out.println(s+""+a);
        b=sc.nextInt();
        sc.nextLine();
        s1=sc.nextLine();
        c=sc.nextInt();
        sc.nextLine();
        s2=sc.nextLine();
        System.out.println(a+""+s1+""+c+""+s2);
    }
}
