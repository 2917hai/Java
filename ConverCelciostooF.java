import java.util.*;
public class ConverCelciostooF {

    public static void main(String[] args) {
        int choice;
        System.out.println("what do you want to convert");
        System.out.println("1) celcious to F,  2)F to celcious");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("enter celcious value");
            int c;
            c=sc.nextInt();
            System.out.println("your F value is "+(9/2)*c+32);
        }
        else if (choice==2) {
            int f;
            f=sc.nextInt();
            System.out.println("your Celcious value is "+(f-32)*5/9);
            
        }
        else
        {
            System.out.println("Incorrect Input");
        }
    }
}