import java.util.Scanner;
public class Switch {
    
    public static void main(String []args)
    {
        int no;
        System.out.println("    choose your name ");
       System.out.println("1).   raja");
       System.out.println("2).   Deepak");
        System.out.println("3).  Umesah");
        System.out.println("4).   raj" );
        System.out.println("enter a number");        
        Scanner s=new Scanner(System.in);
        no=s.nextInt();
        switch(no)
        {
            case 1:
            System.out.println("  raja");
            break;
            case 2:
            System.out.println("  Deepak");
            break;
            case 3:
            System.out.println("  Umesh");
            break;
            case 4:
            System.out.println("  raj");
            break;
            default:
            System.out.println("invalid input ");
            break;





        }

    } 
}
